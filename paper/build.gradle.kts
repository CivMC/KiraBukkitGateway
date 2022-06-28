plugins {
	id("io.papermc.paperweight.userdev")
	id("com.github.johnrengelman.shadow")
	id("xyz.jpenilla.run-paper")
}

dependencies {
	paperDevBundle("1.18.2-R0.1-SNAPSHOT")

	implementation("com.rabbitmq:amqp-client:5.6.0")
	compileOnly("net.civmc.civmodcore:civmodcore-paper:2.3.0:dev-all")
	compileOnly("net.civmc.namelayer:paper:3.0.0-SNAPSHOT:dev")
	compileOnly("net.civmc.civchat2:paper:2.0.0-SNAPSHOT:dev")
	compileOnly("net.civmc.jukealert:paper:3.0.0-SNAPSHOT:dev")
	compileOnly("net.luckperms:api:5.0")
}
