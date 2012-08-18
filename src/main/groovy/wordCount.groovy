def map = [:]

new File(args[0]).eachLine { a ->

    a.split(/\s+/).each { b ->
        map[b] = map[b] == null ? 1 : (map[b] + 1)
    }

    map.entrySet().sort { it.value }.each {
        println "${it.value}: [${it.key}]"
    }

}

