import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import java.util.Collections;

/***
 *Author:gene
 * 该类为了自动生成mybatis plus的代码而建，直接运行就可以按设置的目录路径和连接的数据库表自动生成 mybatis plus 的标准代码
 * 自动生成的Entity最好去掉get和set方法,用lombok加上@Data注解,而且idea也必须安装lombok的plug,
 * 这样idea才能识别lombok生成的get和set方法
 *
 */

public class MyBatisPlusGenerator {

    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/soeasy","gene","123456").globalConfig(builder -> {
            builder.author("gene") //指定作者
                    //.enableSwagger() //开启swagger模式
                    .fileOverride()//指定文件是否覆盖
                    .outputDir("D://Mybatis_plus");//指定输出目录
        }).packageConfig(builder -> {
            builder.parent("com.gene")
                    .moduleName("soeasy")
                    .pathInfo(Collections.singletonMap(OutputFile.xml,"D://Mybatis_plus"));


        })
                .strategyConfig(builder -> {
                    builder.addInclude("sys_user_role","sys_role_menu","hr_position_level","hr_emp_role","hr_comp_position") //设置生成表的名字
                            .addTablePrefix("sys_","hr_","org_"); //设置生成表过滤前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) //使用freemaker模板引擎
                .execute();
    }
}
