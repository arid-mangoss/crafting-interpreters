#! /bin/env bash

find app/src/ | grep '\.class$' | xargs -I{} rm {}