package cn.eleven.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 一定要写注释啊
 * @date: 2019-09-10 15:57
 * @author: 十一
 */
@SpringBootApplication
@EnableMongoRepositories
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @Autowired
    private ErrorInfoRepository errorInfoRepository;

    @Override
    public void run(String... args) throws Exception {

        List<ErrorInfo> list = new ArrayList<ErrorInfo>();
        ErrorInfoEnum[] enumConstants = ErrorInfoEnum.class.getEnumConstants();
        for (ErrorInfoEnum e : enumConstants) {
            ErrorInfo errorInfo = new ErrorInfo(e.getErrorCNMsg(),e.getErrorENMsg(),e.getErrorCode());
            list.add(errorInfo);
        }
        List<ErrorInfo> result = errorInfoRepository.insert(list);
        result.forEach(e -> System.out.println(e.toString()));


    }
}
