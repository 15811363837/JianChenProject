/**
 * 单例模型
 * Created by jianchen on 2017/11/23.
 */
public class LoginManager {

    private static LoginManager   mInstance;

    private LoginManager() {

    }

    public static LoginManager getInstance() {
        if(mInstance == null) {
            synchronized (LoginManager.class) {
                if(mInstance == null) {
                    mInstance = new LoginManager();
                }
            }
        }
        return mInstance;
    }
}
