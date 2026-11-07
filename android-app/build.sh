#!/usr/bin/env bash
# =============================================================================
# HTML2APK — build script (no Gradle / no AndroidX needed)
# Builds a signed release APK from this folder.
#
# Requirements:
#   - JDK 17+ (javac)
#   - Android build-tools 34 (aapt2, d8, zipalign, apksigner)
#   - Android platform android-34 (android.jar)
#
# Usage:
#   ./build.sh
#   SDK=/path/to/android-sdk BT=/path/to/build-tools JDK=/path/to/jdk ./build.sh
# =============================================================================
set -euo pipefail

HERE="$(cd "$(dirname "$0")" && pwd)"

# --- toolchain locations (adjust or export before running) -------------------
SDK="${SDK:-/home/z/android-sdk}"
BT="${BT:-$SDK/android-14}"                 # build-tools 34 extracted folder
PLATFORM="${PLATFORM:-$SDK/android-34}"     # platform android-34 folder
JDK="${JDK:-/home/z/android-sdk/jdk-17.0.21+9}"

ANDROID_JAR="$PLATFORM/android.jar"
AAPT2="$BT/aapt2"
D8_JAR="$BT/lib/d8.jar"
ZIPALIGN="$BT/zipalign"
APKSIGNER="$BT/apksigner"

# --- keystore ----------------------------------------------------------------
KEYSTORE="${KEYSTORE:-$HERE/../keystore/html2apk-release.keystore}"
KS_PASS="${KS_PASS:-html2apk2026}"
KS_ALIAS="${KS_ALIAS:-html2apk}"

OUT="$HERE/build"
rm -rf "$OUT"
mkdir -p "$OUT/classes" "$OUT/dex"

echo "[1/6] Compiling resources (aapt2)..."
"$AAPT2" compile --dir "$HERE/res" -o "$OUT/res.zip"

echo "[2/6] Linking resources + packaging assets..."
"$AAPT2" link \
    -o "$OUT/base.apk" \
    -I "$ANDROID_JAR" \
    --manifest "$HERE/AndroidManifest.xml" \
    --min-sdk-version 28 \
    --target-sdk-version 34 \
    --version-code 1 \
    --version-name "1.0" \
    --auto-add-overlay \
    -A "$HERE/assets" \
    "$OUT/res.zip"

echo "[3/6] Compiling Java sources..."
"$JDK/bin/javac" \
    -source 8 -target 8 \
    -bootclasspath "$ANDROID_JAR" \
    -classpath "$ANDROID_JAR" \
    -d "$OUT/classes" \
    $(find "$HERE/java" -name "*.java")

echo "[4/6] Dexing (d8)..."
"$JDK/bin/java" -cp "$D8_JAR" com.android.tools.r8.D8 \
    --release \
    --lib "$ANDROID_JAR" \
    --min-api 28 \
    --output "$OUT/dex" \
    $(find "$OUT/classes" -name "*.class")

cd "$OUT"
zip -q -j base.apk dex/classes.dex

echo "[5/6] Aligning..."
"$ZIPALIGN" -f 4 base.apk aligned.apk

echo "[6/6] Signing (apksigner, v1+v2)..."
"$APKSIGNER" sign \
    --v1-signing-enabled true \
    --v2-signing-enabled true \
    --v3-signing-enabled true \
    --ks "$KEYSTORE" \
    --ks-key-alias "$KS_ALIAS" \
    --ks-pass "pass:$KS_PASS" \
    --key-pass "pass:$KS_PASS" \
    --out "$OUT/HTML2APK-v1.0-release.apk" \
    aligned.apk

"$APKSIGNER" verify --print-certs "$OUT/HTML2APK-v1.0-release.apk" | head -5
echo ""
echo "✅ APK ready: $OUT/HTML2APK-v1.0-release.apk"
