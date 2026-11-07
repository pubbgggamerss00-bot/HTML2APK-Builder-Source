package androidx.camera.core.impl;

import androidx.camera.camera2.internal.p0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class AutoValue_DeviceProperties extends DeviceProperties {
    private final String manufacturer;
    private final String model;
    private final int sdkVersion;

    public AutoValue_DeviceProperties(String str, String str2, int i6) {
        if (str == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.manufacturer = str;
        if (str2 == null) {
            throw new NullPointerException("Null model");
        }
        this.model = str2;
        this.sdkVersion = i6;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DeviceProperties) {
            DeviceProperties deviceProperties = (DeviceProperties) obj;
            if (this.manufacturer.equals(deviceProperties.manufacturer()) && this.model.equals(deviceProperties.model()) && this.sdkVersion == deviceProperties.sdkVersion()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.manufacturer.hashCode() ^ 1000003) * 1000003) ^ this.model.hashCode()) * 1000003) ^ this.sdkVersion;
    }

    @Override // androidx.camera.core.impl.DeviceProperties
    public String manufacturer() {
        return this.manufacturer;
    }

    @Override // androidx.camera.core.impl.DeviceProperties
    public String model() {
        return this.model;
    }

    @Override // androidx.camera.core.impl.DeviceProperties
    public int sdkVersion() {
        return this.sdkVersion;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeviceProperties{manufacturer=");
        sb.append(this.manufacturer);
        sb.append(", model=");
        sb.append(this.model);
        sb.append(", sdkVersion=");
        return p0.a(sb, this.sdkVersion, "}");
    }
}
