package okhttp3.internal.io;

/* loaded from: classes2.dex */
public interface FileSystem {

    public static final class Companion {

        public static final class SystemFileSystem implements FileSystem {
            public final String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        static {
            new Companion();
        }

        private Companion() {
        }
    }
}
