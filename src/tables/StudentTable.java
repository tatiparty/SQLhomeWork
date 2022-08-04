package tables;

import db.IDBExecutor;
import db.PostGreSqlDBExecutor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentTable extends TableAbs{

    private IDBExecutor idbExecutor = new PostGreSqlDBExecutor(new ArrayList<String>(){{
        add("student_fio");
        add("sex");
        add("id_group");
    }});

    @Override
    public List list(String[] predicates) {
        return null;
    }

    public List add(String[] values){
        String queryValue = convertValueToString(values);

        String listStudentQuery = String.format("insert into student (fio, sex, id_group) values %s", queryValue);

        List<Map<String, String>> result = idbExecutor.execute(listStudentQuery);

        return result;

    }

    public String convertValueToString(String[] values){
        String result = "";
        for(int i=0; i<=(values.length)-1; i++) {
            String str = values[i];
            result = result + str;

        }
        return result;
    }

}
