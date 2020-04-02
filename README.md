# 我的springcloud学习笔记
[toc]
## 视频
> [学习视频](
https://www.bilibili.com/video/BV18E411x7eT?p=26)
## springboot和springcloud版本选择
根据接口返回json串选择选型版本
> [版本约束查询接口](https://start.spring.io/actuator/info)

## 组件选型
![bec03cf5f33238a203822a837bd122c6.png](en-resource://database/686:1)

## 编码思想
约定>配置>编码

## RestTemplate
![fd68c967b5811fea172579fc1bfd293f.png](en-resource://database/691:1)

## 2个springboot项目
1个生产者1个消费者 略

## 使用Eureka
1. 注册中心集群：为了实现高可用，避免单点故障
2. provider集群
3. 负载均衡：@LoadBalanced注解，默认轮询模式（Ribbon的基本原理）
```
@Configuration
public class ApplicationContextConfig {    

    @Bean    
    @LoadBalanced    
    public RestTemplate getRestTemplate(){        
        return new RestTemplate();   
     }
}
```
4. actuator监控信息完善
![41a8dd6e8acce1fbdbc0b2b3164d8a29.png](en-resource://database/695:0)
5. 服务发现
- 主启动：@EnableDiscoveryClient
- ![6cb396a931a13432bc9e26b0b1598ac0.png](en-resource://database/697:0)
6. Eureka的自我保护机制：**分布式CAP中的AP分支**
某个服务不可用时Eureka不会立即注销该微服务
>![4012b62dfe20301b59cb3cf0564f5ee8.png](en-resource://database/701:1)


## zookeeper
需要一个linux服务器就看视频了解一下
1. 节点：是否带序号的临时/持久节点 2大类4小类

## Consul
1. 安装运行
> cmd : consul agent -dev

## 注册中心小结
![57139d217ebbca5fd68a1356c9e0402c.png](en-resource://database/703:0)

## Ribbon 
1. **客户端Consumer负载均衡工具**
2. RestTemplate的getForObject和getForEntity方法的区别：getForEntity返回ResponseEntity格式，POST方法同理
3. Ribbon默认自带的7中负载均衡算法的替换（IRule接口的实现类）+ 自定义Rule
- 自带算法替换
![9fcd02ffd004d0e65567fa0c87e77021.png](en-resource://database/705:0)
- 手撸一个自定义Rule
