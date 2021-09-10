package CaseStudy;
import java.io.File;
import java.io.FileFilter;
public class FileFilterImpl implements FileFilter{
    boolean result;
    @Override
    public boolean accept(File pathname){
        if(pathname.exists()){
            File[] fileList = pathname.listFiles();
            for(File file:fileList){
                if(file.isDirectory()){
                    accept(file);
                }else{
                    this.result = file.getName().endsWith(".java");
                    if(this.result){
                        System.out.println(file.getName());
                    }
                }
            }
        }
        return this.result;
    }
}
