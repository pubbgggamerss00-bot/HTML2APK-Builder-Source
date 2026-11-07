package org.jf.dexlib2.dexbacked;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.jf.dexlib2.Opcodes;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.iface.DexFile;
import org.jf.dexlib2.iface.MultiDexContainer;
import org.jf.dexlib2.util.DexUtil;

/* loaded from: classes3.dex */
public class ZipDexContainer implements MultiDexContainer<DexBackedDexFile> {
    private final Opcodes opcodes;
    private final File zipFilePath;

    public static class NotAZipFileException extends RuntimeException {
    }

    public ZipDexContainer(File file, Opcodes opcodes) {
        this.zipFilePath = file;
        this.opcodes = opcodes;
    }

    @Override // org.jf.dexlib2.iface.MultiDexContainer
    public List<String> getDexEntryNames() throws IOException {
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = getZipFile();
        try {
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                if (isDex(zipFile, zipEntryNextElement)) {
                    arrayList.add(zipEntryNextElement.getName());
                }
            }
            return arrayList;
        } finally {
            zipFile.close();
        }
    }

    @Override // org.jf.dexlib2.iface.MultiDexContainer
    public MultiDexContainer.DexEntry<DexBackedDexFile> getEntry(String str) throws IOException {
        ZipFile zipFile = getZipFile();
        try {
            ZipEntry entry = zipFile.getEntry(str);
            if (entry != null) {
                return loadEntry(zipFile, entry);
            }
            zipFile.close();
            return null;
        } finally {
            zipFile.close();
        }
    }

    public ZipFile getZipFile() throws IOException {
        try {
            return new ZipFile(this.zipFilePath);
        } catch (IOException unused) {
            throw new NotAZipFileException();
        }
    }

    public boolean isDex(ZipFile zipFile, ZipEntry zipEntry) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntry));
        try {
            DexUtil.verifyDexHeader(bufferedInputStream);
            bufferedInputStream.close();
            return true;
        } catch (DexBackedDexFile.NotADexFile unused) {
            bufferedInputStream.close();
            return false;
        } catch (DexUtil.InvalidFile unused2) {
            bufferedInputStream.close();
            return false;
        } catch (DexUtil.UnsupportedFile unused3) {
            bufferedInputStream.close();
            return false;
        } catch (Throwable th2) {
            bufferedInputStream.close();
            throw th2;
        }
    }

    public boolean isZipFile() throws IOException {
        try {
            ZipFile zipFile = getZipFile();
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (IOException unused) {
                }
            }
            return true;
        } catch (IOException | NotAZipFileException unused2) {
            return false;
        }
    }

    public MultiDexContainer.DexEntry loadEntry(ZipFile zipFile, final ZipEntry zipEntry) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
            final byte[] bArrC = oc.a.c(inputStream);
            return new MultiDexContainer.DexEntry() { // from class: org.jf.dexlib2.dexbacked.ZipDexContainer.1
                @Override // org.jf.dexlib2.iface.MultiDexContainer.DexEntry
                public MultiDexContainer getContainer() {
                    return ZipDexContainer.this;
                }

                @Override // org.jf.dexlib2.iface.MultiDexContainer.DexEntry
                public DexFile getDexFile() {
                    return new DexBackedDexFile(ZipDexContainer.this.opcodes, bArrC);
                }

                @Override // org.jf.dexlib2.iface.MultiDexContainer.DexEntry
                public String getEntryName() {
                    return zipEntry.getName();
                }
            };
        } finally {
            inputStream.close();
        }
    }
}
