package com.y55555a.oasystem.util;



import freemarker.core.InvalidReferenceException;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

import java.io.*;
import java.util.Map;

/**
 * @Author y55555a
 * Date on 2020/5/2  22:39
 */
public class DocUtil {

    private Configuration configure;
    public DocUtil() {
        configure = new Configuration(Configuration.VERSION_2_3_22);
        configure.setDefaultEncoding("utf-8");
    }
    public void createDoc(String filePath, Map<String,Object> dataMap, String name) {
        Template template = null;
        try {
            //设置异常处理器
            configure.setTemplateExceptionHandler(TemplateExceptionHandler.IGNORE_HANDLER);
            configure.setDirectoryForTemplateLoading(new File(filePath));

            //定义Template对象，注意模板类型名字与downloadType要一致
            template = configure.getTemplate(name+".xml");
            File outFile=new File(filePath,name+".doc");
            Writer out=null;
            out=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile), "utf-8"));

            template.process(dataMap, out);
            out.flush();
            out.close();
        } catch (IOException e) {
        } catch (InvalidReferenceException e) {
        } catch (TemplateException e) {
        }
    }
}
