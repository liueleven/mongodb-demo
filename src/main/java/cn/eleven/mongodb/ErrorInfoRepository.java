package cn.eleven.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @description: 一定要写注释啊
 * @date: 2019-09-10 16:01
 * @author: 十一
 */
public interface ErrorInfoRepository extends MongoRepository<ErrorInfo, String> {
}
