package cn.thf.sorm.core;

/**单例设计模式,,浅克隆
 * @author tianhf
 * @date 2020/5/23 16:43
 * @Version 1.0
 */
public class QueryFactory {
    private static QueryFactory factory=new QueryFactory();
    //private static Class<?> Clazz;
    private  static Query prototypeObj;
    static{

        try {
            Class<?>  Clazz = Class.forName(DBManager.getConf().getQueryClass());
            prototypeObj = (Query) Clazz.newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private QueryFactory(){};
    public Query CreateQuery(){
//        try {
//            return (Query)Clazz.newInstance();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//        }
        return (Query) prototypeObj.clone();
   };

}
