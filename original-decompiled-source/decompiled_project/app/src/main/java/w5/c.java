package w5;

import i8.n;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f31274a;

    /* renamed from: b, reason: collision with root package name */
    public FileChannel f31275b;

    public c(String filename) {
        r.e(filename, "filename");
        this.f31274a = filename.concat(".lck");
    }

    public final void a() throws IOException {
        String str = this.f31274a;
        if (this.f31275b != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.f31275b = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th2) {
            FileChannel fileChannel = this.f31275b;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.f31275b = null;
            throw new IllegalStateException(n.d("Unable to lock file: '", str, "'."), th2);
        }
    }
}
