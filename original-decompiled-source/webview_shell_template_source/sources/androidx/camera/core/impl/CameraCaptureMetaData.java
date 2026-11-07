package androidx.camera.core.impl;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class CameraCaptureMetaData {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public enum AeMode {
        UNKNOWN,
        OFF,
        ON,
        ON_AUTO_FLASH,
        ON_ALWAYS_FLASH,
        ON_AUTO_FLASH_REDEYE,
        ON_EXTERNAL_FLASH
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public enum AeState {
        UNKNOWN,
        INACTIVE,
        SEARCHING,
        FLASH_REQUIRED,
        CONVERGED,
        LOCKED
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public enum AfMode {
        UNKNOWN,
        OFF,
        ON_MANUAL_AUTO,
        ON_CONTINUOUS_AUTO
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public enum AfState {
        UNKNOWN,
        INACTIVE,
        SCANNING,
        PASSIVE_FOCUSED,
        PASSIVE_NOT_FOCUSED,
        LOCKED_FOCUSED,
        LOCKED_NOT_FOCUSED
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public enum AwbMode {
        UNKNOWN,
        OFF,
        AUTO,
        INCANDESCENT,
        FLUORESCENT,
        WARM_FLUORESCENT,
        DAYLIGHT,
        CLOUDY_DAYLIGHT,
        TWILIGHT,
        SHADE
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public enum AwbState {
        UNKNOWN,
        INACTIVE,
        METERING,
        CONVERGED,
        LOCKED
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public enum FlashState {
        UNKNOWN,
        NONE,
        READY,
        FIRED
    }

    private CameraCaptureMetaData() {
    }
}
