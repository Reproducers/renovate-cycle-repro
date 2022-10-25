plugins {
    alias(libs.plugins.javiersc.hubdle)
}

hubdle {
    config {
        documentation {
            changelog()
            readme { badges() }
            site()
        }
        nexus()
    }
}
