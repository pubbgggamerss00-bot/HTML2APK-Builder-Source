package ge;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final FileChannel f12015a;

    /* renamed from: b, reason: collision with root package name */
    public final FileLock f12016b;

    public b(FileChannel fileChannel, FileLock fileLock) {
        this.f12015a = fileChannel;
        this.f12016b = fileLock;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b a(Context context) throws IOException {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new b(channel, fileLockLock);
                } catch (IOException e10) {
                    e = e10;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Error e11) {
                    e = e11;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                    }
                    if (channel != null) {
                    }
                    return null;
                } catch (OverlappingFileLockException e12) {
                    e = e12;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                    }
                    if (channel != null) {
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e13) {
                e = e13;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e14) {
            e = e14;
            channel = null;
            fileLockLock = null;
        }
    }

    public final void b() throws IOException {
        try {
            this.f12016b.release();
            this.f12015a.close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }
}
