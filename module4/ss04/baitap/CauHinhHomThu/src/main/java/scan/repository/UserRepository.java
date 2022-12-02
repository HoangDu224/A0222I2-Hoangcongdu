package scan.repository;

import scan.model.UserConfig;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    static List<UserConfig> userConfigs = new ArrayList<>();
    static {
        userConfigs.add(new UserConfig(1,"abc","English","25",false));
        userConfigs.add(new UserConfig(2,"bnm","Vietnamese","24",true));
    }
    public List<UserConfig> findAll(){
        return userConfigs;
    }
    public UserConfig findById( int id ){
        for (int i = 0 ; i<userConfigs.size();i++){
            if (userConfigs.get(i).getId()==id){
                return userConfigs.get(i);
            }
        }
        return null;
    }
}
