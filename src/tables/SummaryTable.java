package tables;

import db.IDBExecutor;
import db.PostGreSqlDBExecutor;
import dob.Summary;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SummaryTable extends TableAbs{

    private IDBExecutor idbExecutor = new PostGreSqlDBExecutor(new ArrayList<String>(){{
        add("student_fio");
        add("sex");
        add("id_group");
        add("name");
        add("fio");
    }});

    @Override
    public List list(String[] predicates) {
        String queryWithParam = convertArrayToString(predicates);
        String listStudentQuery = String.format("select * from student join curator_group ON curator_group.id = student.id_group join curator ON curator.id = curator_group.id_curator %s", queryWithParam);

        List<Summary> summary = new ArrayList<>();

        List<Map<String, String>> result = idbExecutor.execute(listStudentQuery);
        for(Map<String, String> res: result){
            summary.add(
                    new Summary(
                            res.get("student_fio"),
                            res.get("sex"),
                            Integer.parseInt(res.get("id_group")),
                            res.get("name"),
                            res.get("fio")
                    )
            );
        }

        return summary;
    }

    @Override
    public List add(String[] predicates) {
        return null;
    }

    public String convertArrayToString(String[] predicates){
        String result = "";
        for(int i=0; i<=(predicates.length)-1; i++) {
            String str = predicates[i];
            result = result + str;

        }
        return result;
    }
}
