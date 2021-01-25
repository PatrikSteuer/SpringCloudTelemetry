#!/bin/bash
SCRIPT_DIR=$(dirname "$0")
docker-compose -f "$SCRIPT_DIR/jaeger-docker-compose.yml" up -d

echo "Jaeger Dashboard: http://localhost:16686"