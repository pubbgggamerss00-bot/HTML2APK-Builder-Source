package org.gradle.wrapper;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.URI;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Formatter;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import org.bouncycastle.asn1.x509.DisplayText;
import org.gradle.internal.file.PathTraversalChecker;
import org.gradle.internal.file.locking.ExclusiveFileAccessManager;

/* loaded from: HTML-to-APK-Builder_v1.32_zfix2.apk:assets/android_project_template_root/gradle/wrapper/gradle-wrapper.jar:org/gradle/wrapper/Install.class */
public final class Install {
    public final Logger logger;
    public final Download download;
    public final PathAssembler pathAssembler;
    public final ExclusiveFileAccessManager exclusiveFileAccessManager = new ExclusiveFileAccessManager();

    /* loaded from: HTML-to-APK-Builder_v1.32_zfix2.apk:assets/android_project_template_root/gradle/wrapper/gradle-wrapper.jar:org/gradle/wrapper/Install$InstallCheck.class */
    public final class InstallCheck {
        public final File gradleHome;
        public final String failureMessage;

        public InstallCheck(File file, String str) {
            this.gradleHome = file;
            this.failureMessage = str;
        }
    }

    public Install(Logger logger, Download download, PathAssembler pathAssembler) {
        this.logger = logger;
        this.download = download;
        this.pathAssembler = pathAssembler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.util.List] */
    public static InstallCheck verifyDistributionRoot(File file, String str) {
        File[] fileArrListFiles;
        ArrayList arrayListEmptyList;
        File[] fileArrListFiles2;
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            ArrayList arrayList = new ArrayList();
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    arrayList.add(file2);
                }
            }
            arrayListEmptyList = arrayList;
        } else {
            arrayListEmptyList = Collections.emptyList();
        }
        if (arrayListEmptyList.isEmpty()) {
            return new InstallCheck(null, String.format("Gradle distribution '%s' does not contain any directories. Expected to find exactly 1 directory.", str));
        }
        if (arrayListEmptyList.size() != 1) {
            return new InstallCheck(null, String.format("Gradle distribution '%s' contains too many directories. Expected to find exactly 1 directory.", str));
        }
        File file3 = (File) arrayListEmptyList.get(0);
        File file4 = new File(file3, "lib");
        return ((!file4.exists() || !file4.isDirectory() || (fileArrListFiles2 = file4.listFiles(new BootstrapMainStarter$1())) == null || fileArrListFiles2.length != 1) ? null : fileArrListFiles2[0]) == null ? new InstallCheck(null, String.format("Gradle distribution '%s' does not appear to contain a Gradle distribution.", str)) : new InstallCheck(file3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
    public static void verifyDownloadChecksum(String str, File file, String str2) throws NoSuchAlgorithmException, IOException {
        int i10;
        if (str2 == null) {
            return;
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        InputStream inputStreamNewInputStream = Files.newInputStream(file.toPath(), new OpenOption[0]);
        try {
            byte[] bArr = new byte[4096];
            do {
                i10 = inputStreamNewInputStream.read(bArr);
                if (i10 > 0) {
                    messageDigest.update(bArr, 0, i10);
                }
            } while (i10 != -1);
            inputStreamNewInputStream.close();
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b10 : bArrDigest) {
                String hexString = Integer.toHexString(b10 & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            String string = sb.toString();
            if (str2.equals(string)) {
                return;
            }
            file.delete();
            throw new RuntimeException(String.format("Verification of Gradle distribution failed!%n%nYour Gradle distribution may have been tampered with.%nConfirm that the 'distributionSha256Sum' property in your gradle-wrapper.properties file is correct and you are downloading the wrapper from a trusted source.%n%nDistribution Url: %s%nDownload Location: %s%nExpected checksum: '%s'%nActual checksum:   '%s'%nVisit https://gradle.org/release-checksums/ to verify the checksums of official distributions. If your build uses a custom distribution, see with its provider.", str, file.getAbsolutePath(), str2, string));
        } catch (Throwable th2) {
            InputStream inputStream = inputStreamNewInputStream;
            if (inputStream != null) {
                try {
                    inputStream = inputStreamNewInputStream;
                    inputStream.close();
                } catch (Throwable th3) {
                    th3.addSuppressed(inputStream);
                }
            }
            throw th2;
        }
    }

    public static boolean deleteDir(File file) {
        String[] list;
        if (file.isDirectory() && (list = file.list()) != null) {
            for (String str : list) {
                if (!deleteDir(new File(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.zip.ZipFile] */
    public static void unzip(File file, File file2) throws IOException {
        Throwable zipFile = new ZipFile(file);
        try {
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                File file3 = new File(file2, PathTraversalChecker.safePathName(zipEntryNextElement.getName()));
                if (zipEntryNextElement.isDirectory()) {
                    file3.mkdirs();
                } else {
                    zipFile = zipFile;
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(Files.newOutputStream(file3.toPath(), new OpenOption[0]));
                    try {
                        InputStream inputStream = zipFile.getInputStream(zipEntryNextElement);
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i10 = inputStream.read(bArr);
                            if (i10 < 0) {
                                break;
                            } else {
                                bufferedOutputStream.write(bArr, 0, i10);
                            }
                        }
                        inputStream.close();
                        bufferedOutputStream.close();
                        bufferedOutputStream.close();
                    } finally {
                    }
                }
            }
            zipFile.close();
        } catch (Throwable th2) {
            try {
                zipFile = zipFile;
                zipFile.close();
            } catch (Throwable th3) {
                th3.addSuppressed(zipFile);
            }
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.io.Closeable] */
    public final File createDist(WrapperConfiguration wrapperConfiguration) throws Throwable {
        File file;
        File file2;
        FileLock fileLock;
        URI uri = wrapperConfiguration.distribution;
        PathAssembler pathAssembler = this.pathAssembler;
        pathAssembler.getClass();
        String path = wrapperConfiguration.distribution.getPath();
        String strSubstring = path;
        int iLastIndexOf = path.lastIndexOf("/");
        if (iLastIndexOf >= 0) {
            strSubstring = strSubstring.substring(iLastIndexOf + 1);
        }
        int iLastIndexOf2 = strSubstring.lastIndexOf(".");
        String strSubstring2 = iLastIndexOf2 < 0 ? strSubstring : strSubstring.substring(0, iLastIndexOf2);
        String aSCIIString = Download.safeUri(wrapperConfiguration.distribution).toASCIIString();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(aSCIIString.getBytes("UTF-8"));
            String str = strSubstring2 + "/" + new BigInteger(1, messageDigest.digest()).toString(36);
            String str2 = wrapperConfiguration.distributionBase;
            if (str2.equals("GRADLE_USER_HOME")) {
                file = pathAssembler.gradleUserHome;
            } else {
                if (!str2.equals("PROJECT")) {
                    throw new RuntimeException("Base: " + str2 + " is unknown");
                }
                file = pathAssembler.projectDirectory;
            }
            File file3 = new File(file, wrapperConfiguration.distributionPath + "/" + str);
            String str3 = wrapperConfiguration.zipBase;
            if (str3.equals("GRADLE_USER_HOME")) {
                file2 = pathAssembler.gradleUserHome;
            } else {
                if (!str3.equals("PROJECT")) {
                    throw new RuntimeException("Base: " + str3 + " is unknown");
                }
                file2 = pathAssembler.projectDirectory;
            }
            File file4 = new File(file2, wrapperConfiguration.zipPath + "/" + str + "/" + strSubstring);
            ExclusiveFileAccessManager exclusiveFileAccessManager = this.exclusiveFileAccessManager;
            Callable callable = () -> {
                return r1.lambda$createDist$0(r2, r3, r4, r5);
            };
            exclusiveFileAccessManager.getClass();
            File file5 = new File(file4.getParentFile(), file4.getName() + ".lck");
            File parentFile = file5.getParentFile();
            if (!parentFile.mkdirs() && (!parentFile.exists() || !parentFile.isDirectory())) {
                throw new RuntimeException("Could not create parent directory for lock file " + file5.getAbsolutePath());
            }
            RandomAccessFile randomAccessFile = null;
            FileChannel fileChannel = null;
            try {
                long jNanoTime = (System.nanoTime() / 1000000) + 120000;
                FileLock fileLock2 = null;
                while (true) {
                    fileLock = fileLock2;
                    if (fileLock != null || System.nanoTime() / 1000000 >= jNanoTime) {
                        break;
                    }
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(file5, "rw");
                    try {
                        FileChannel channel = randomAccessFile2.getChannel();
                        fileChannel = channel;
                        FileLock fileLockTryLock = channel.tryLock();
                        if (fileLockTryLock == null) {
                            ExclusiveFileAccessManager.maybeCloseQuietly(fileChannel);
                            ExclusiveFileAccessManager.maybeCloseQuietly(randomAccessFile2);
                            Thread.sleep(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
                        }
                        fileLock2 = fileLockTryLock;
                        randomAccessFile = randomAccessFile2;
                    } catch (Throwable th2) {
                        th = th2;
                        randomAccessFile = randomAccessFile2;
                        Throwable th3 = th;
                        ExclusiveFileAccessManager.maybeCloseQuietly(fileChannel);
                        ExclusiveFileAccessManager.maybeCloseQuietly(randomAccessFile);
                        throw th3;
                    }
                }
                ?? r02 = fileLock;
                if (r02 == 0) {
                    throw new RuntimeException("Timeout of 120000 reached waiting for exclusive access to file: " + file4.getAbsolutePath());
                }
                try {
                    r02 = randomAccessFile;
                    FileChannel fileChannel2 = fileChannel;
                    Object objCall = callable.call();
                    fileLock.release();
                    ExclusiveFileAccessManager.maybeCloseQuietly(fileChannel2);
                    ExclusiveFileAccessManager.maybeCloseQuietly(r02);
                    return (File) objCall;
                } catch (Throwable th4) {
                    fileLock.release();
                    ExclusiveFileAccessManager.maybeCloseQuietly(fileChannel);
                    ExclusiveFileAccessManager.maybeCloseQuietly(th4);
                    throw r02;
                }
            } catch (Throwable th5) {
                th = th5;
                Throwable th32 = th;
                ExclusiveFileAccessManager.maybeCloseQuietly(fileChannel);
                ExclusiveFileAccessManager.maybeCloseQuietly(randomAccessFile);
                throw th32;
            }
        } catch (Exception e10) {
            throw new RuntimeException("Could not hash input string.", e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void unzipLocal(File file, File file2) {
        try {
            unzip(file, file2);
        } catch (IOException e10) {
            this.logger.log("Could not unzip " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            this.logger.log("Reason: " + e10.getMessage());
            throw file;
        }
    }

    public final void forceFetch(File file, URI uri, int i10, int i11) throws Throwable {
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 < 0) {
            i11 = 500;
        }
        int i12 = i10;
        Logger logger = this.logger;
        Object[] objArr = new Object[1];
        objArr[0] = i12 <= 0 ? "" : String.format(" (retrying %d times, with an initial back off of %d ms)", Integer.valueOf(i10), Integer.valueOf(i11));
        logger.log(String.format("Fetching distribution%s.", objArr));
        int i13 = i10 + 1;
        long j10 = i11;
        IOException e10 = null;
        for (int i14 = 1; i14 <= i13; i14++) {
            try {
                File file2 = new File(file.getParentFile(), file.getName() + ".part");
                file2.delete();
                this.logger.log("Downloading " + Download.safeUri(uri));
                this.download.download(uri, file2);
                if (file.exists()) {
                    file.delete();
                }
                file2.renameTo(file);
                return;
            } catch (IOException e11) {
                e10 = e11;
                int i15 = i14;
                this.logger.log(String.format("Attempt %d/%d failed. Reason: %s", Integer.valueOf(i14), Integer.valueOf(i13), e10.getMessage()));
                if (i15 < i13) {
                    long j11 = j10;
                    Thread.sleep(j11);
                    j10 = j11 * 2;
                }
            }
        }
        throw e10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093 A[Catch: ZipException -> 0x013e, TRY_ENTER, TRY_LEAVE, TryCatch #5 {ZipException -> 0x013e, blocks: (B:12:0x0069, B:19:0x008c, B:21:0x0093, B:40:0x00e0, B:41:0x00e9, B:43:0x00f3, B:45:0x0100, B:46:0x0108, B:48:0x0124, B:23:0x009b, B:27:0x00a8, B:29:0x00b0, B:33:0x00c0, B:35:0x00c8, B:37:0x00ce, B:16:0x0075, B:17:0x007e, B:18:0x0083), top: B:136:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f3 A[Catch: ZipException -> 0x013e, TRY_ENTER, TRY_LEAVE, TryCatch #5 {ZipException -> 0x013e, blocks: (B:12:0x0069, B:19:0x008c, B:21:0x0093, B:40:0x00e0, B:41:0x00e9, B:43:0x00f3, B:45:0x0100, B:46:0x0108, B:48:0x0124, B:23:0x009b, B:27:0x00a8, B:29:0x00b0, B:33:0x00c0, B:35:0x00c8, B:37:0x00ce, B:16:0x0075, B:17:0x007e, B:18:0x0083), top: B:136:0x0069 }] */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final File lambda$createDist$0(File file, File file2, URI uri, WrapperConfiguration wrapperConfiguration) throws Throwable {
        ArrayList<File> arrayListEmptyList;
        File file3 = new File(file.getParentFile(), file.getName() + ".ok");
        if (file2.isDirectory() && file3.isFile()) {
            InstallCheck installCheckVerifyDistributionRoot = verifyDistributionRoot(file2, file2.getAbsolutePath());
            File file4 = installCheckVerifyDistributionRoot.gradleHome;
            if (file4 != null) {
                return file4;
            }
            System.err.println(installCheckVerifyDistributionRoot.failureMessage);
            file3.delete();
        }
        String str = wrapperConfiguration.distributionSha256Sum;
        boolean z10 = false;
        int i10 = 3;
        do {
            try {
                if (!file.isFile() || z10) {
                    forceFetch(file, uri, wrapperConfiguration.retries, wrapperConfiguration.retryBackOffMs);
                }
                if (file2.exists()) {
                    File[] fileArrListFiles = file2.listFiles();
                    if (fileArrListFiles != null) {
                        ArrayList arrayList = new ArrayList();
                        for (File file5 : fileArrListFiles) {
                            if (file5.isDirectory()) {
                                arrayList.add(file5);
                            }
                        }
                        arrayListEmptyList = arrayList;
                    }
                    while (r0.hasNext()) {
                    }
                    verifyDownloadChecksum(wrapperConfiguration.distribution.toASCIIString(), file, str);
                    unzipLocal(file, file2);
                    z10 = false;
                } else {
                    arrayListEmptyList = Collections.emptyList();
                    for (File file6 : arrayListEmptyList) {
                        this.logger.log("Deleting directory " + file6.getAbsolutePath());
                        deleteDir(file6);
                    }
                    verifyDownloadChecksum(wrapperConfiguration.distribution.toASCIIString(), file, str);
                    unzipLocal(file, file2);
                    z10 = false;
                }
            } catch (ZipException unused) {
                if (i10 >= 3 && str == null) {
                    URI uri2 = wrapperConfiguration.distribution;
                    try {
                        URI uriResolve = uri2.resolve(uri2.getPath() + ".sha256");
                        File file7 = new File(file.getParentFile(), file.getName() + ".sha256");
                        forceFetch(file7, uriResolve, wrapperConfiguration.retries, wrapperConfiguration.retryBackOffMs);
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(file7.toPath(), new OpenOption[0]), StandardCharsets.UTF_8));
                        try {
                            String line = bufferedReader.readLine();
                            bufferedReader.close();
                            str = line;
                        } catch (Throwable th2) {
                            try {
                                bufferedReader = bufferedReader;
                                bufferedReader.close();
                            } catch (Throwable th3) {
                                th3.addSuppressed(bufferedReader);
                            }
                            throw th2;
                        }
                    } catch (Exception e10) {
                        this.logger.log("Could not fetch hash for " + Download.safeUri(uri2) + ".");
                        this.logger.log("Reason: " + e10.getMessage());
                        str = null;
                    }
                }
                z10 = true;
                int i11 = i10 - 1;
                i10 = i11;
                if (i11 <= 0) {
                    throw new RuntimeException("Downloaded distribution file " + file + " is no valid zip file.");
                }
            }
        } while (z10);
        InstallCheck installCheckVerifyDistributionRoot2 = verifyDistributionRoot(file2, Download.safeUri(uri).toASCIIString());
        File file8 = installCheckVerifyDistributionRoot2.gradleHome;
        if (file8 == null) {
            throw new RuntimeException(installCheckVerifyDistributionRoot2.failureMessage);
        }
        if (!System.getProperty("os.name").toLowerCase(Locale.US).contains("windows")) {
            File file9 = new File(file8, "bin/gradle");
            String message = null;
            try {
                String[] strArr = new String[3];
                strArr[0] = "chmod";
                strArr[1] = "755";
                strArr[2] = file9.getCanonicalPath();
                Process processStart = new ProcessBuilder(strArr).start();
                if (processStart.waitFor() != 0) {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(processStart.getInputStream(), StandardCharsets.UTF_8));
                    Formatter formatter = new Formatter();
                    while (true) {
                        String line2 = bufferedReader2.readLine();
                        if (line2 == null) {
                            break;
                        }
                        Object[] objArr = new Object[1];
                        objArr[0] = line2;
                        formatter.format("%s%n", objArr);
                    }
                    message = formatter.toString();
                }
            } catch (IOException e11) {
                message = e11.getMessage();
            } catch (InterruptedException e12) {
                Thread.currentThread().interrupt();
                message = e12.getMessage();
            }
            if (message != null) {
                this.logger.log("Could not set executable permissions for: " + file9.getAbsolutePath());
            }
        }
        file3.createNewFile();
        file.delete();
        return installCheckVerifyDistributionRoot2.gradleHome;
    }
}
