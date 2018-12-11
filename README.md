Output:

```
Hibernate: select book0_.id as id1_1_0_, book0_.author_id as author_i3_1_0_, book0_.name as name2_1_0_ from book book0_ where book0_.id=?
Hibernate: select author0_.id as id1_0_0_, author0_.name as name2_0_0_ from author author0_ where author0_.id=?
data class: Евгений Онегин
Hibernate: select bookopen0_.id as id1_1_0_, bookopen0_.author_id as author_i3_1_0_, bookopen0_.name as name2_1_0_ from book bookopen0_ where bookopen0_.id=?
open class: Евгений Онегин
```
