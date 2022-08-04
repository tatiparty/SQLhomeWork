package db;

import java.util.Map;
import java.util.List;

public interface IDBExecutor {
    List<Map<String, String>> execute(String query);
}
