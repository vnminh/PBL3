package mapper;

import java.sql.ResultSet;
import java.util.ArrayList;

public interface InterfaceMapper<T> {
	ArrayList<T> mapListItem(ResultSet rs);
}
