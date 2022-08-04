package tables;

import db.IDBExecutor;
import db.PostGreSqlDBExecutor;
import dob.GroupWithCurator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GroupWithCuratorTable extends TableAbs{

    private IDBExecutor idbExecutor = new PostGreSqlDBExecutor(new ArrayList<String>(){{
        add("name");
        add("fio");
    }});

    @Override
    public List list(String[] predicates) {

        String queryWithParam = convertArrayToString(predicates);
        String listStudentQuery = String.format("select * from curator_group join curator ON curator.id = curator_group.id_curator %s", queryWithParam);

        List<GroupWithCurator> groupsWithCurator = new ArrayList<>();

        List<Map<String, String>> result = idbExecutor.execute(listStudentQuery);
        for(Map<String, String> res: result){
            groupsWithCurator.add(
                    new GroupWithCurator(
                            res.get("name"),
                            res.get("fio")
                    )
            );
        }

        return groupsWithCurator;
    }

    @Override
    public List add(String[] values) {
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
