package scan.repository;

import org.springframework.stereotype.Repository;
import scan.model.UserConfig;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    static List<UserConfig> userConfigs = new ArrayList<>();
    static {
        userConfigs.add(new UserConfig(1,"abc","English","25",false));
        userConfigs.add(new UserConfig(2,"bnm","Vietnamese","24",true));
        userConfigs.add(new UserConfig(3,"gsfdsfs","Vietnamese","24",true,"scrips creiptsdlad"));
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
    public void updateUser(UserConfig userConfig){
        for (int i = 0 ; i<userConfigs.size();i++){
            if (userConfigs.get(i).getId()==userConfig.getId()){
                userConfigs.get(i).setLanguage(userConfig.getLanguage());
                userConfigs.get(i).setName(userConfig.getName());
                userConfigs.get(i).setPageSize(userConfig.getPageSize());
                userConfigs.get(i).setSignature(userConfig.getSignature());
            }
        }
    }
}
