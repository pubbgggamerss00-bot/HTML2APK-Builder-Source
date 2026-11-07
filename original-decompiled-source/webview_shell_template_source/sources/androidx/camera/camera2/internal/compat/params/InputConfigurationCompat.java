package androidx.camera.camera2.internal.compat.params;

import android.annotation.SuppressLint;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class InputConfigurationCompat {
    private final InputConfigurationCompatImpl mImpl;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class InputConfigurationCompatApi31Impl extends InputConfigurationCompatApi23Impl {
        public InputConfigurationCompatApi31Impl(Object obj) {
            super(obj);
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatApi23Impl, androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public boolean isMultiResolution() {
            return ((InputConfiguration) getInputConfiguration()).isMultiResolution();
        }

        public InputConfigurationCompatApi31Impl(int i6, int i7, int i8) {
            super(i6, i7, i8);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class InputConfigurationCompatBaseImpl implements InputConfigurationCompatImpl {
        private final int mFormat;
        private final int mHeight;
        private final int mWidth;

        public InputConfigurationCompatBaseImpl(int i6, int i7, int i8) {
            this.mWidth = i6;
            this.mHeight = i7;
            this.mFormat = i8;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof InputConfigurationCompatBaseImpl)) {
                return false;
            }
            InputConfigurationCompatBaseImpl inputConfigurationCompatBaseImpl = (InputConfigurationCompatBaseImpl) obj;
            return inputConfigurationCompatBaseImpl.getWidth() == this.mWidth && inputConfigurationCompatBaseImpl.getHeight() == this.mHeight && inputConfigurationCompatBaseImpl.getFormat() == this.mFormat;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public int getFormat() {
            return this.mFormat;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public int getHeight() {
            return this.mHeight;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public Object getInputConfiguration() {
            return null;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public int getWidth() {
            return this.mWidth;
        }

        public int hashCode() {
            int i6 = 31 ^ this.mWidth;
            int i7 = this.mHeight ^ ((i6 << 5) - i6);
            return this.mFormat ^ ((i7 << 5) - i7);
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public boolean isMultiResolution() {
            return false;
        }

        @SuppressLint({"DefaultLocale"})
        public String toString() {
            return String.format("InputConfiguration(w:%d, h:%d, format:%d)", Integer.valueOf(this.mWidth), Integer.valueOf(this.mHeight), Integer.valueOf(this.mFormat));
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface InputConfigurationCompatImpl {
        int getFormat();

        int getHeight();

        Object getInputConfiguration();

        int getWidth();

        boolean isMultiResolution();
    }

    public InputConfigurationCompat(int i6, int i7, int i8) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.mImpl = new InputConfigurationCompatApi31Impl(i6, i7, i8);
        } else {
            this.mImpl = new InputConfigurationCompatApi23Impl(i6, i7, i8);
        }
    }

    public static InputConfigurationCompat wrap(Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new InputConfigurationCompat(new InputConfigurationCompatApi31Impl(obj)) : new InputConfigurationCompat(new InputConfigurationCompatApi23Impl(obj));
    }

    public boolean equals(Object obj) {
        if (obj instanceof InputConfigurationCompat) {
            return this.mImpl.equals(((InputConfigurationCompat) obj).mImpl);
        }
        return false;
    }

    public int getFormat() {
        return this.mImpl.getFormat();
    }

    public int getHeight() {
        return this.mImpl.getHeight();
    }

    public int getWidth() {
        return this.mImpl.getWidth();
    }

    public int hashCode() {
        return this.mImpl.hashCode();
    }

    public boolean isMultiResolution() {
        return this.mImpl.isMultiResolution();
    }

    public String toString() {
        return this.mImpl.toString();
    }

    public Object unwrap() {
        return this.mImpl.getInputConfiguration();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class InputConfigurationCompatApi23Impl implements InputConfigurationCompatImpl {
        private final InputConfiguration mObject;

        public InputConfigurationCompatApi23Impl(Object obj) {
            this.mObject = (InputConfiguration) obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof InputConfigurationCompatImpl) {
                return Objects.equals(this.mObject, ((InputConfigurationCompatImpl) obj).getInputConfiguration());
            }
            return false;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public int getFormat() {
            return this.mObject.getFormat();
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public int getHeight() {
            return this.mObject.getHeight();
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public Object getInputConfiguration() {
            return this.mObject;
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public int getWidth() {
            return this.mObject.getWidth();
        }

        public int hashCode() {
            return this.mObject.hashCode();
        }

        @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.InputConfigurationCompatImpl
        public boolean isMultiResolution() {
            return false;
        }

        public String toString() {
            return this.mObject.toString();
        }

        public InputConfigurationCompatApi23Impl(int i6, int i7, int i8) {
            this(new InputConfiguration(i6, i7, i8));
        }
    }

    private InputConfigurationCompat(InputConfigurationCompatImpl inputConfigurationCompatImpl) {
        this.mImpl = inputConfigurationCompatImpl;
    }
}
