package org.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;



/**
 * Unit test for simple App.
 */
public class CitySorting {

    public static void main(String[] args) {
        String test = "photo1.jpg , Warsaw , 2016-01-01 13:30:25\nphoto2.jpg , London , 2017-01-01 13:30:25\n";
        test += "photo2.jpg , Warsaw , 2011-01-01 13:30:25\nphoto7.jpg , Warsaw , 2018-01-01 13:30:25\n";
        test += "photo3.jpg , Warsaw , 2006-01-01 13:30:25\nphoto8.jpg , London , 2019-01-01 13:30:25";

        System.out.println(solution(test));

    }

    private static String solution(String test) {
        List<String> photos = Arrays.asList(test.split("\n"));

        Map<String, Long> cityCounts = photos.stream().map(photo -> photo.split(",")[1])
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //System.out.println(cityCounts);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(" yyyy-MM-dd HH:mm:ss");

        java.util.Collections.sort(photos, (photo1, photo2) -> LocalDateTime.from(formatter.parse(photo1.split(",")[2]))
                .compareTo(LocalDateTime.from(formatter.parse(photo2.split(",")[2]))));
        //System.out.println(photos);

        final Map<String, Long> cityPhotoCounter = cityCounts.keySet().stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(cityPhotoCounter);

        Function<String,String> photoMapper = photo -> {
            String[] photoParts = photo.split(",");
            String city = photoParts[1];
            Long counter = cityPhotoCounter.get(city);
            cityPhotoCounter.put(city, counter + 1);
            int length = (int)(Math.log10(cityCounts.get(city))+1);
            String digits = String.format("%0"+length + "d", counter);
            String format = photoParts[0].substring(photoParts[0].lastIndexOf("."), photoParts[0].length());
            return city.trim() + digits + format;
        };
        return photos.stream().map(photoMapper).collect(Collectors.joining("\n"));
    }


}
