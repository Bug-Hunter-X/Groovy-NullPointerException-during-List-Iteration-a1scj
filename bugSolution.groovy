def myMethod(List<String> list) {
    list.each { item ->
        if (item != null) {
            // Process non-null items
        } else {
            // Handle null values (e.g., log a warning, use a default value)
            println "Null value encountered in list"
        }
    }
}