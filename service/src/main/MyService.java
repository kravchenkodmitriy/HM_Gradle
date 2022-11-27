public class MyService {
    private DbSetting dbSetting = new DbSetting("name", "password");
    private String name = "myService";
    private Db db = new Db(dbSetting);

    return new StringBuilder().append("MyEntity{").append("id=").append(id).append(", name='").append(name).append('\'').append('}').toString();

    public String getName() {
        return name;
    }

    public MyEntity setMyEntity(MyEntity myEntity){
        myEntity.setId(UUID.random());
        db.setMyEntity(myEntity);
        return myEntity;
    }

    public MyEntity getMyEntity() {
        return db.getMyentity;
    }
}
