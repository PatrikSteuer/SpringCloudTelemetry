FROM fluent/fluentd:v1.11.5-1.0

# Use root account to use apk
USER root

# Install fluent-plugin-influxdb plugin. 
# See:
# - https://hub.docker.com/r/fluent/fluentd
# - https://docs.fluentd.org/how-to-guides/syslog-influxdb
RUN apk add --no-cache --update --virtual .build-deps \
        sudo build-base ruby-dev && \
        sudo gem install fluent-plugin-influxdb && \
        sudo gem sources --clear-all && \
        apk del .build-deps && \
        rm -rf /tmp/* /var/tmp/* /usr/lib/ruby/gems/*/cache/*.gem

USER fluent