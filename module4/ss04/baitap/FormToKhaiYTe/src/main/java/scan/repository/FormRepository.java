package scan.repository;

import org.springframework.stereotype.Repository;
import scan.model.ToKhai;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FormRepository {
    static List<ToKhai> toKhaiList = new ArrayList<>();

    public void addToKhai(ToKhai toKhai){
        toKhaiList.add(toKhai);
    }
}
