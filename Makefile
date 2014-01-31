PROD_HOST=agi.rax.io
PROD_PATH=deployed/agi.rax.io-rtis/resources/public/

watch:
	@JVM_OPTS="-Xmx1024m -server" boot watch hoplon

build:
	@JVM_OPTS="-Xmx1024m -server" boot hoplon

dev:
	@#@boot devserver start :port 9999
	@lein run

clean:
	rm -rf target/classes target/*.jar target/stale

scp:
	scp -r resources/public/* $(PROD_HOST):$(PROD_PATH)

deploy: build scp
