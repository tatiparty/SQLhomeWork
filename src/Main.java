import dob.GroupWithCurator;
import dob.Summary;
import tables.GroupWithCuratorTable;
import tables.ITable;
import tables.SummaryTable;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Вывести на экран информацию о всех студентах, включая название группы и имя куратора

        String[] predicates = new String[]{};

        ITable summaryTable = new SummaryTable();
        List<Summary> summary = summaryTable.list(predicates);
        System.out.println("Список всех студентов:" + '\n' + summary + '\n');

        //Вывести на экран количество студентов

        System.out.println("Количество студентов: " + summary.size() + '\n');

        //Вывести студенток

        predicates = new String[]{"where ", "student.sex = 'female'",};

        ITable summaryTableFemale = new SummaryTable();
        List<Summary> summaryFemale = summaryTableFemale.list(predicates);
        System.out.println("Список студенток:" + '\n' + summaryFemale + '\n');

        //Обновить данные по группе, сменив куратора - обновление работает, но запрос ничего не возвращает

        /*ITable curatorGroup = new Curator_groupTable();

        String[] values = new String[]{"id_curator = 4 ", "where ", "name = 'Group1'",};

        List<Curator_group> newGroupData = curatorGroup.add(values);
        System.out.println(newGroupData);*/

        //Вывести список групп с их кураторами

        predicates = new String[]{};

        ITable groupWithCuratorTable = new GroupWithCuratorTable();
        List<GroupWithCurator> groupWithCurator = groupWithCuratorTable.list(predicates);
        System.out.println("Список групп с их кураторами:" + '\n' + groupWithCurator + '\n');

        //Используя вложенные запросы, вывести на экран студентов из определенной группы (поиск по имени группы)

        predicates = new String[]{"where ", "curator_group.name = 'Group1'",};

        ITable summaryTableGroup1 = new SummaryTable();
        List<Summary> summaryGroup1 = summaryTableGroup1.list(predicates);
        System.out.println("Список студентов из группы 'Group1':" + '\n' + summaryGroup1 + '\n');

        //Код добавления записей в таблицу student, запись добавляется, но запрос ничего не возвращает

        /*String[] values = new String[]{"(", "'Student20', ", "'male', ", "1", ")"};

        List<Student> newStudents = studentTable.add(values);
        System.out.println(newStudents);
        */

    }
}
