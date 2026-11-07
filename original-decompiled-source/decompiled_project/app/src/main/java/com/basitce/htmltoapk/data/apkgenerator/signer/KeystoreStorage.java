package com.basitce.htmltoapk.data.apkgenerator.signer;

import ah.l;
import ah.p;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Base64;
import com.basitce.htmltoapk.data.apkgenerator.ConfigCrypto;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.r;
import l0.k;
import lh.j;
import mh.t;
import mh.x;
import mh.y;
import pg.f0;
import pg.n;
import pg.p;
import pg.q;
import qg.o;
import qg.z;

/* loaded from: classes.dex */
public final class KeystoreStorage {
    public static final int $stable = 0;
    public static final String FILE_EXTENSION = ".p12";
    private static final String FILE_PREFIX = "htmltoapk_keystore_";
    public static final KeystoreStorage INSTANCE = new KeystoreStorage();
    private static final String KEYSTORE_FILE_NAME = "keystore.p12";
    private static final String PASSWORD_FILE_NAME = "keystore.p12.pass";
    private static final String RELATIVE_PATH = "HTMLtoAPK/Keystores";

    private KeystoreStorage() {
    }

    private final String decryptPassword(String str) {
        try {
            byte[] bArrDecode = Base64.decode(str, 2);
            ConfigCrypto configCrypto = ConfigCrypto.INSTANCE;
            r.b(bArrDecode);
            return new String(configCrypto.decryptConfig(bArrDecode), mh.a.f18238b);
        } catch (Exception unused) {
            return null;
        }
    }

    private final boolean deletePackageUsingLegacyPublicDir(Context context, String str) {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), m3.a.a("HTMLtoAPK/Keystores/", safePackageName(str)));
        if (file.exists() && file.isDirectory()) {
            return l.f(file);
        }
        return false;
    }

    private final boolean deletePackageUsingMediaStore(Context context, String str) throws IOException {
        int iDelete;
        ContentResolver contentResolver = context.getContentResolver();
        String strPackageRelativePath = packageRelativePath(str);
        Uri contentUri = MediaStore.Downloads.getContentUri("external_primary");
        r.d(contentUri, "getContentUri(...)");
        Cursor cursorQuery = contentResolver.query(contentUri, new String[]{"_id"}, "relative_path = ? AND (_display_name = ? OR _display_name = ?)", new String[]{strPackageRelativePath, KEYSTORE_FILE_NAME, PASSWORD_FILE_NAME}, null);
        if (cursorQuery != null) {
            try {
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
                iDelete = 0;
                while (cursorQuery.moveToNext()) {
                    iDelete += contentResolver.delete(Uri.withAppendedPath(contentUri, String.valueOf(cursorQuery.getLong(columnIndexOrThrow))), null, null);
                }
                f0 f0Var = f0.f21461a;
                cursorQuery.close();
            } finally {
            }
        } else {
            iDelete = 0;
        }
        return iDelete > 0;
    }

    private final String encryptPassword(String str) {
        ConfigCrypto configCrypto = ConfigCrypto.INSTANCE;
        byte[] bytes = str.getBytes(mh.a.f18238b);
        r.d(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(configCrypto.encryptConfig(bytes), 2);
        r.d(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    private final String fileDigest(InputStream inputStream) throws IOException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bArr = new byte[8192];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 < 0) {
                    byte[] bArrDigest = messageDigest.digest();
                    r.d(bArrDigest, "digest(...)");
                    String strY = o.y(bArrDigest, "", new c(), 30);
                    inputStream.close();
                    return strY;
                }
                messageDigest.update(bArr, 0, i10);
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ah.c.a(inputStream, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence fileDigest$lambda$8$lambda$7(byte b10) {
        return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
    }

    private final n<InputStream, String> findPackageUsingLegacyPublicDir(Context context, String str) {
        String strDecryptPassword;
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), m3.a.a("HTMLtoAPK/Keystores/", safePackageName(str)));
        if (!file.exists() || !file.isDirectory()) {
            return null;
        }
        File file2 = new File(file, KEYSTORE_FILE_NAME);
        File file3 = new File(file, PASSWORD_FILE_NAME);
        if (file2.exists() && file3.exists() && (strDecryptPassword = decryptPassword(l.k(file3, mh.a.f18238b))) != null) {
            return new n<>(new FileInputStream(file2), strDecryptPassword);
        }
        return null;
    }

    private final n<InputStream, String> findPackageUsingMediaStore(Context context, String str) throws IOException {
        String strDecryptPassword;
        InputStream inputStreamOpenInputStream;
        InputStream inputStreamOpenInputStream2;
        ContentResolver contentResolver = context.getContentResolver();
        String strPackageRelativePath = packageRelativePath(str);
        Uri contentUri = MediaStore.Downloads.getContentUri("external_primary");
        r.d(contentUri, "getContentUri(...)");
        String[] strArr = {"_id", "_display_name"};
        Cursor cursorQuery = contentResolver.query(contentUri, strArr, "relative_path = ? AND _display_name = ?", new String[]{strPackageRelativePath, KEYSTORE_FILE_NAME}, null);
        if (cursorQuery != null) {
            try {
                Uri uriWithAppendedPath = cursorQuery.moveToFirst() ? Uri.withAppendedPath(contentUri, String.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id")))) : null;
                cursorQuery.close();
                if (uriWithAppendedPath != null && (cursorQuery = contentResolver.query(contentUri, strArr, "relative_path = ? AND _display_name = ?", new String[]{strPackageRelativePath, PASSWORD_FILE_NAME}, null)) != null) {
                    try {
                        int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
                        if (!cursorQuery.moveToFirst() || (inputStreamOpenInputStream2 = contentResolver.openInputStream(Uri.withAppendedPath(contentUri, String.valueOf(cursorQuery.getLong(columnIndexOrThrow))))) == null) {
                            strDecryptPassword = null;
                        } else {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenInputStream2, mh.a.f18238b), 8192);
                            try {
                                String strD = p.d(bufferedReader);
                                bufferedReader.close();
                                strDecryptPassword = INSTANCE.decryptPassword(strD);
                            } finally {
                            }
                        }
                        cursorQuery.close();
                        if (strDecryptPassword != null && (inputStreamOpenInputStream = contentResolver.openInputStream(uriWithAppendedPath)) != null) {
                            return new n<>(inputStreamOpenInputStream, strDecryptPassword);
                        }
                    } finally {
                    }
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
        return null;
    }

    private final List<PersistedKeystore> findUsingLegacyPublicDir(Context context) {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), RELATIVE_PATH);
        if (!file.exists() || !file.isDirectory()) {
            return z.f22752a;
        }
        int i10 = 0;
        return j.k(new lh.p(j.i(l.p(file), new d(i10)), new e(i10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean findUsingLegacyPublicDir$lambda$32(File it) {
        r.e(it, "it");
        if (it.isFile()) {
            String name = it.getName();
            r.d(name, "getName(...)");
            if (t.i(name, FILE_EXTENSION, false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PersistedKeystore findUsingLegacyPublicDir$lambda$33(File file) {
        r.e(file, "file");
        Uri uriFromFile = Uri.fromFile(file);
        r.d(uriFromFile, "fromFile(...)");
        String name = file.getName();
        r.d(name, "getName(...)");
        return new PersistedKeystore(uriFromFile, name, file);
    }

    private final List<PersistedKeystore> findUsingMediaStore(Context context) throws IOException {
        ArrayList arrayList = new ArrayList();
        ContentResolver contentResolver = context.getContentResolver();
        Uri contentUri = MediaStore.Downloads.getContentUri("external_primary");
        r.d(contentUri, "getContentUri(...)");
        Cursor cursorQuery = contentResolver.query(contentUri, new String[]{"_id", "_display_name", "relative_path", "owner_package_name"}, "relative_path LIKE ?", new String[]{k3.a.a(Environment.DIRECTORY_DOWNLOADS, "/HTMLtoAPK/Keystores/%")}, null);
        if (cursorQuery == null) {
            return arrayList;
        }
        try {
            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
            int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("_display_name");
            int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow("relative_path");
            int columnIndex = cursorQuery.getColumnIndex("owner_package_name");
            while (cursorQuery.moveToNext()) {
                long j10 = cursorQuery.getLong(columnIndexOrThrow);
                String string = cursorQuery.getString(columnIndexOrThrow2);
                String string2 = cursorQuery.getString(columnIndexOrThrow3);
                if (string2 == null) {
                    string2 = "";
                }
                String string3 = columnIndex >= 0 ? cursorQuery.getString(columnIndex) : null;
                if (x.r(string2, RELATIVE_PATH, true)) {
                    Pattern patternCompile = Pattern.compile("(?i).*\\.p12(?: \\(\\d+\\))?$");
                    r.d(patternCompile, "compile(...)");
                    r.b(string);
                    if (patternCompile.matcher(string).matches() && (Build.VERSION.SDK_INT < 30 || string3 == null || string3.equals(context.getPackageName()))) {
                        Uri uriWithAppendedPath = Uri.withAppendedPath(contentUri, String.valueOf(j10));
                        r.b(uriWithAppendedPath);
                        arrayList.add(new PersistedKeystore(uriWithAppendedPath, string, null, 4, null));
                    }
                }
            }
            f0 f0Var = f0.f21461a;
            cursorQuery.close();
            return arrayList;
        } finally {
        }
    }

    private final String packageRelativePath(String str) {
        return k3.b.a(Environment.DIRECTORY_DOWNLOADS, "/HTMLtoAPK/Keystores/", safePackageName(str));
    }

    private final boolean persistPackageUsingLegacyPublicDir(Context context, String str, File file, String str2) throws IOException {
        try {
            File file2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "HTMLtoAPK/Keystores/" + safePackageName(str));
            file2.mkdirs();
            File file3 = new File(file2, KEYSTORE_FILE_NAME);
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                try {
                    ah.b.a(fileInputStream, fileOutputStream, 8192);
                    fileOutputStream.close();
                    fileInputStream.close();
                    l.r(new File(file2, PASSWORD_FILE_NAME), encryptPassword(str2), mh.a.f18238b);
                    return true;
                } finally {
                }
            } finally {
            }
        } catch (Exception unused) {
            return false;
        }
    }

    private final boolean persistPackageUsingMediaStore(Context context, String str, File file, String str2) throws IOException {
        ContentResolver contentResolver = context.getContentResolver();
        Uri contentUri = MediaStore.Downloads.getContentUri("external_primary");
        r.d(contentUri, "getContentUri(...)");
        String strPackageRelativePath = packageRelativePath(str);
        deletePackageUsingMediaStore(context, str);
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", KEYSTORE_FILE_NAME);
        contentValues.put("mime_type", "application/x-pkcs12");
        contentValues.put("relative_path", strPackageRelativePath);
        Uri uriInsert = contentResolver.insert(contentUri, contentValues);
        if (uriInsert == null) {
            return false;
        }
        try {
            OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
            if (outputStreamOpenOutputStream == null) {
                throw new IllegalStateException("Could not open keystore output stream");
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    ah.b.a(fileInputStream, outputStreamOpenOutputStream, 8192);
                    fileInputStream.close();
                    outputStreamOpenOutputStream.close();
                    byte[] bytes = encryptPassword(str2).getBytes(mh.a.f18238b);
                    r.d(bytes, "getBytes(...)");
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("_display_name", PASSWORD_FILE_NAME);
                    contentValues2.put("mime_type", "text/plain");
                    contentValues2.put("relative_path", strPackageRelativePath);
                    Uri uriInsert2 = contentResolver.insert(contentUri, contentValues2);
                    if (uriInsert2 == null || (outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert2)) == null) {
                        return true;
                    }
                    try {
                        outputStreamOpenOutputStream.write(bytes);
                        f0 f0Var = f0.f21461a;
                        outputStreamOpenOutputStream.close();
                        return true;
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (Exception unused) {
            contentResolver.delete(uriInsert, null, null);
            return false;
        }
    }

    private final Uri persistUsingLegacyPublicDir(Context context, File file, String str) throws IOException {
        File file2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), RELATIVE_PATH);
        file2.mkdirs();
        File file3 = new File(file2, str);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                try {
                    ah.b.a(fileInputStream, fileOutputStream, 8192);
                    fileOutputStream.close();
                    fileInputStream.close();
                    return Uri.fromFile(file3);
                } finally {
                }
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }

    private final Uri persistUsingMediaStore(Context context, File file, String str) throws IOException {
        ContentResolver contentResolver = context.getContentResolver();
        Uri contentUri = MediaStore.Downloads.getContentUri("external_primary");
        r.d(contentUri, "getContentUri(...)");
        List<PersistedKeystore> listFindUsingMediaStore = findUsingMediaStore(context);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listFindUsingMediaStore) {
            if (r.a(((PersistedKeystore) obj).getDisplayName(), str)) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            contentResolver.delete(((PersistedKeystore) obj2).getUri(), null, null);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", "application/x-pkcs12");
        contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS + "/HTMLtoAPK/Keystores");
        Uri uriInsert = contentResolver.insert(contentUri, contentValues);
        if (uriInsert == null) {
            return null;
        }
        try {
            OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
            if (outputStreamOpenOutputStream == null) {
                return uriInsert;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    ah.b.a(fileInputStream, outputStreamOpenOutputStream, 8192);
                    fileInputStream.close();
                    outputStreamOpenOutputStream.close();
                    return uriInsert;
                } finally {
                }
            } finally {
            }
        } catch (Exception unused) {
            contentResolver.delete(uriInsert, null, null);
            return null;
        }
    }

    private final String safePackageName(String input) {
        Pattern patternCompile = Pattern.compile("[^a-zA-Z0-9._-]");
        r.d(patternCompile, "compile(...)");
        r.e(input, "input");
        String strReplaceAll = patternCompile.matcher(input).replaceAll("_");
        r.d(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final boolean deletePackageKeystore(Context context, String packageName) {
        r.e(context, "context");
        r.e(packageName, "packageName");
        return Build.VERSION.SDK_INT >= 29 ? deletePackageUsingMediaStore(context, packageName) : deletePackageUsingLegacyPublicDir(context, packageName);
    }

    public final boolean deletePersistedKeystore(Context context, Uri uri) {
        String lowerCase;
        String path;
        r.e(context, "context");
        r.e(uri, "uri");
        try {
            String scheme = uri.getScheme();
            if (scheme != null) {
                lowerCase = scheme.toLowerCase(Locale.ROOT);
                r.d(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
        } catch (Exception unused) {
        }
        if (r.a(lowerCase, "content")) {
            return context.getContentResolver().delete(uri, null, null) > 0;
        }
        if (r.a(lowerCase, "file") && (path = uri.getPath()) != null) {
            return new File(path).delete();
        }
        return false;
    }

    public final n<File, String> findPackageKeystore(Context context, String packageName) throws IOException {
        r.e(context, "context");
        r.e(packageName, "packageName");
        n<InputStream, String> nVarFindPackageUsingMediaStore = Build.VERSION.SDK_INT >= 29 ? findPackageUsingMediaStore(context, packageName) : findPackageUsingLegacyPublicDir(context, packageName);
        if (nVarFindPackageUsingMediaStore == null) {
            return null;
        }
        InputStream inputStream = nVarFindPackageUsingMediaStore.f21469a;
        String str = nVarFindPackageUsingMediaStore.f21470b;
        try {
            File file = new File(context.getFilesDir(), "keystores/" + safePackageName(packageName));
            file.mkdirs();
            File file2 = new File(file, KEYSTORE_FILE_NAME);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    ah.b.a(inputStream, fileOutputStream, 8192);
                    fileOutputStream.close();
                    inputStream.close();
                    return new n<>(file2, str);
                } finally {
                }
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public final List<PersistedKeystore> findPersistedKeystores(Context context) {
        r.e(context, "context");
        return Build.VERSION.SDK_INT >= 29 ? findUsingMediaStore(context) : findUsingLegacyPublicDir(context);
    }

    public final synchronized Uri persistKeystore(Context context, File sourceFile, String alias) {
        Object obj;
        Object objA;
        try {
            r.e(context, "context");
            r.e(sourceFile, "sourceFile");
            r.e(alias, "alias");
            String strFileDigest = fileDigest(new FileInputStream(sourceFile));
            Iterator<T> it = findPersistedKeystores(context).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                PersistedKeystore persistedKeystore = (PersistedKeystore) next;
                KeystoreStorage keystoreStorage = INSTANCE;
                try {
                    InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(persistedKeystore.getUri());
                    objA = Boolean.valueOf(r.a(inputStreamOpenInputStream != null ? keystoreStorage.fileDigest(inputStreamOpenInputStream) : null, strFileDigest));
                } catch (Throwable th2) {
                    objA = q.a(th2);
                }
                Object obj2 = Boolean.FALSE;
                if (objA instanceof p.a) {
                    objA = obj2;
                }
                if (((Boolean) objA).booleanValue()) {
                    obj = next;
                    break;
                }
            }
            PersistedKeystore persistedKeystore2 = (PersistedKeystore) obj;
            if (persistedKeystore2 != null) {
                return persistedKeystore2.getUri();
            }
            Pattern patternCompile = Pattern.compile("[^a-zA-Z0-9_-]");
            r.d(patternCompile, "compile(...)");
            String strReplaceAll = patternCompile.matcher(alias).replaceAll("_");
            r.d(strReplaceAll, "replaceAll(...)");
            String str = FILE_PREFIX + y.b0(32, strReplaceAll) + "_" + strFileDigest + FILE_EXTENSION;
            return Build.VERSION.SDK_INT >= 29 ? persistUsingMediaStore(context, sourceFile, str) : persistUsingLegacyPublicDir(context, sourceFile, str);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final boolean persistPackageKeystore(Context context, String packageName, File sourceFile, String password) {
        r.e(context, "context");
        r.e(packageName, "packageName");
        r.e(sourceFile, "sourceFile");
        r.e(password, "password");
        return Build.VERSION.SDK_INT >= 29 ? persistPackageUsingMediaStore(context, packageName, sourceFile, password) : persistPackageUsingLegacyPublicDir(context, packageName, sourceFile, password);
    }

    public static final class PersistedKeystore {
        public static final int $stable = 8;
        private final String displayName;
        private final File file;
        private final Uri uri;

        public PersistedKeystore(Uri uri, String displayName, File file) {
            r.e(uri, "uri");
            r.e(displayName, "displayName");
            this.uri = uri;
            this.displayName = displayName;
            this.file = file;
        }

        public static /* synthetic */ PersistedKeystore copy$default(PersistedKeystore persistedKeystore, Uri uri, String str, File file, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                uri = persistedKeystore.uri;
            }
            if ((i10 & 2) != 0) {
                str = persistedKeystore.displayName;
            }
            if ((i10 & 4) != 0) {
                file = persistedKeystore.file;
            }
            return persistedKeystore.copy(uri, str, file);
        }

        public final Uri component1() {
            return this.uri;
        }

        public final String component2() {
            return this.displayName;
        }

        public final File component3() {
            return this.file;
        }

        public final PersistedKeystore copy(Uri uri, String displayName, File file) {
            r.e(uri, "uri");
            r.e(displayName, "displayName");
            return new PersistedKeystore(uri, displayName, file);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PersistedKeystore)) {
                return false;
            }
            PersistedKeystore persistedKeystore = (PersistedKeystore) obj;
            return r.a(this.uri, persistedKeystore.uri) && r.a(this.displayName, persistedKeystore.displayName) && r.a(this.file, persistedKeystore.file);
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final File getFile() {
            return this.file;
        }

        public final Uri getUri() {
            return this.uri;
        }

        public int hashCode() {
            int iA = k.a(this.uri.hashCode() * 31, 31, this.displayName);
            File file = this.file;
            return iA + (file == null ? 0 : file.hashCode());
        }

        public String toString() {
            return "PersistedKeystore(uri=" + this.uri + ", displayName=" + this.displayName + ", file=" + this.file + ")";
        }

        public /* synthetic */ PersistedKeystore(Uri uri, String str, File file, int i10, kotlin.jvm.internal.j jVar) {
            this(uri, str, (i10 & 4) != 0 ? null : file);
        }
    }
}
