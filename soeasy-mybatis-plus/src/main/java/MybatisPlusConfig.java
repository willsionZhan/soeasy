import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.autoconfigure.ConfigurationCustomizer;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;

@EnableTransactionManagement
@Configuration
@MapperScan({"com.gene.soeasy.*","com.gene.soeasy.**.*"})
public class MybatisPlusConfig {


    /**
     * 注册插件
     * 新的分页插件,一缓和二缓遵循mybatis的规则,需要设置 MybatisConfiguration#useDeprecatedExecutor = false
     * 避免缓存出现问题(该属性会在旧插件移除后一同移除)
     * 注意事项：在自动生成代码的时候可以在yml文件中设置map-underscore-to-camel-case: true
     * 但是在开发过程中记得要把修改map-underscore-to-camel-case: false
     * 否则会出现不能识别字段名的错误
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }

}
