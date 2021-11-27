// ენუმერაცია 3 წევრით
public enum CollectionNames {
    LIST("ArrayList"),
    MAP("HashMap"),
    SET("HashSet");

//    შემოგვაქვს კონსტრუქტორ ტიპის ცვლადი
    private String collectionNames;

//    ენუმერაციისატვის String მნიშვნელობების მისანიჭებლად String property
    private CollectionNames(String collectionNames){
        this.collectionNames = collectionNames;
    }

//    toString() -ის დაოვერაიდება ენუმერაციიდან სტრინგ მნიშვნელობების ამოსარებად
    @Override
    public String toString(){
        return this.collectionNames;
    }

//    ეს მეთოდი პრინტავს ენუმერაციის ყველა წევრის მნიშვენლობას
    public static void example1(){
        for (CollectionNames i : CollectionNames.values()){
            System.out.println(i);
        }
    }
}
