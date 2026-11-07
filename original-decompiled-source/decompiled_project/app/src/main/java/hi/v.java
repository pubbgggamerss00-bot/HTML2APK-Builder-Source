package hi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public class v extends n {
    @Override // hi.n
    public final List<b0> N(b0 dir) throws IOException {
        kotlin.jvm.internal.r.e(dir, "dir");
        File file = dir.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                throw new IOException("failed to list " + dir);
            }
            throw new FileNotFoundException("no such file: " + dir);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            kotlin.jvm.internal.r.b(str);
            arrayList.add(dir.e(str));
        }
        qg.t.u(arrayList);
        return arrayList;
    }

    @Override // hi.n
    public m d0(b0 path) {
        kotlin.jvm.internal.r.e(path, "path");
        File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new m(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
    }

    @Override // hi.n
    public final l e0(b0 file) {
        kotlin.jvm.internal.r.e(file, "file");
        return new u(new RandomAccessFile(file.toFile(), "r"));
    }

    @Override // hi.n
    public final j0 f0(b0 file, boolean z10) throws IOException {
        kotlin.jvm.internal.r.e(file, "file");
        if (!z10 || !M(file)) {
            File file2 = file.toFile();
            Logger logger = y.f13119a;
            return x.e(new FileOutputStream(file2, false));
        }
        throw new IOException(file + " already exists.");
    }

    @Override // hi.n
    public final l0 g0(b0 file) {
        kotlin.jvm.internal.r.e(file, "file");
        return x.g(file.toFile());
    }

    @Override // hi.n
    public final j0 h(b0 file) {
        kotlin.jvm.internal.r.e(file, "file");
        File file2 = file.toFile();
        Logger logger = y.f13119a;
        return x.e(new FileOutputStream(file2, true));
    }

    @Override // hi.n
    public void l(b0 source, b0 target) throws IOException {
        kotlin.jvm.internal.r.e(source, "source");
        kotlin.jvm.internal.r.e(target, "target");
        if (source.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // hi.n
    public final void p(b0 dir) throws IOException {
        kotlin.jvm.internal.r.e(dir, "dir");
        if (dir.toFile().mkdir()) {
            return;
        }
        m mVarD0 = d0(dir);
        if (mVarD0 == null || !mVarD0.f13087b) {
            throw new IOException("failed to create directory: " + dir);
        }
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // hi.n
    public final void z(b0 path) throws IOException {
        kotlin.jvm.internal.r.e(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + path);
    }
}
