#!/bin/bash
SCRIPT_DIR=$(dirname "$0")
docker-compose -f "$SCRIPT_DIR/influx-grafana-docker-compose.yml" down