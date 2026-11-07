package hi;

import hi.b0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* loaded from: classes2.dex */
public final class w extends v {
    public static Long i0(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // hi.v, hi.n
    public final m d0(b0 path) throws IOException {
        b0 b0VarA;
        kotlin.jvm.internal.r.e(path, "path");
        Path pathF = path.f();
        try {
            BasicFileAttributes attributes = Files.readAttributes(pathF, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(pathF) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = b0.f13033b;
                b0VarA = b0.a.a(symbolicLink.toString());
            } else {
                b0VarA = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lI0 = fileTimeCreationTime != null ? i0(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lI02 = fileTimeLastModifiedTime != null ? i0(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new m(zIsRegularFile, zIsDirectory, b0VarA, lValueOf, lI0, lI02, fileTimeLastAccessTime != null ? i0(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // hi.v, hi.n
    public final void l(b0 source, b0 target) throws IOException {
        kotlin.jvm.internal.r.e(source, "source");
        kotlin.jvm.internal.r.e(target, "target");
        try {
            Files.move(source.f(), target.f(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e10) {
            throw new FileNotFoundException(e10.getMessage());
        }
    }

    @Override // hi.v
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
