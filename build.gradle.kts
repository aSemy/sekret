plugins {
    base
}

group = "net.afanasev"
version = "0.2.2-SNAPSHOT"

tasks.wrapper {
    gradleVersion = "7.5"
    distributionType = Wrapper.DistributionType.ALL
}
