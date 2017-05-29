**Notes**
1. JPA implementation provider is hibernate.
2. Table is designed before coding.
3. Primary key of each table is auto-increment
4. foo.bar.pojo.* is purely domain object, while foo.bar.entity.* are based on these POJOS, with JPA annotation. Additional class properties (foo.bar.entity.Level2.level1) is required for each for table foreign key (LEVEL2.LEVEL1_PK), with annotation @JoinColumn.
6. Expected table result after JPA persistence:

    | PK | NAME | CREATE 
    |----|------|--------
    | 1  | 1    | 2017-05-29 09:34:28.553
                                                
    | PK | LEVEL1_PK | NAME | CREATE 
    |----|-----------|------|-------
    | 1  | 1         | 2.1  | 2017-05-29 09:34:28.553
    | 2  | 1         | 2.2  | 2017-05-29 09:34:28.553
    
    | PK | LEVEL2_PK | NAME  | CREATE 
    |----|-----------|-------|-------
    | 1  | 1         | 3.1.1 | 2017-05-29 09:34:28.553
    | 2  | 1         | 3.1.2 | 2017-05-29 09:34:28.553
    | 3  | 2         | 3.2.1 | 2017-05-29 09:34:28.553
    | 4  | 2         | 3.2.2 | 2017-05-29 09:34:28.553