package k6;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f16001e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16002a;

    /* renamed from: b, reason: collision with root package name */
    public final File f16003b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f16004c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f16005d;

    public a(String str, File file, boolean z10) {
        Lock lock;
        this.f16002a = z10;
        this.f16003b = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap map = f16001e;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f16004c = lock;
    }

    public final void a(boolean z10) throws IOException {
        this.f16004c.lock();
        if (z10) {
            File file = this.f16003b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f16005d = channel;
            } catch (IOException e10) {
                this.f16005d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    public final void b() throws IOException {
        try {
            FileChannel fileChannel = this.f16005d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f16004c.unlock();
    }
}
