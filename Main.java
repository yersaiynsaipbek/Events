public class Main {


    public static void main(String[] args) {


        try{
            for (Event event : getMovies()){
                validEvent(event);
            }
            for (Event event : getTheatres()){
                validEvent(event);
            }
            System.out.println("Все события корректны");
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        

    }

        public static Movie[] getMovies() {
            return new Movie[]{
                    new Movie("Начало", 2010, 16),
            };
        }

        public static Theatre[] getTheatres() {
            return new Theatre[]{
                    new Theatre("Анна Каренина", 2017, 16),
            };
        }

        public static void validEvent(Event event) {
            if (event.getTitle() == null || event.getReleaseYear() == 0 || event.getAge() == 0) {
                throw new RuntimeException("Некорректное событие: " + event);
            }

        }
}
