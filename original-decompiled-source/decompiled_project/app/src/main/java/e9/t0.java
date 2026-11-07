package e9;

import android.app.Application;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import androidx.core.content.FileProvider;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.apkgenerator.BuildLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.build.BuildViewModel$copyToPublicDownloads$2", f = "BuildViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class t0 extends vg.i implements eh.p<ph.i0, tg.e<? super Uri>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Application f8562a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8563b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ File f8564c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f8565d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(Application application, String str, File file, String str2, tg.e<? super t0> eVar) {
        super(2, eVar);
        this.f8562a = application;
        this.f8563b = str;
        this.f8564c = file;
        this.f8565d = str2;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new t0(this.f8562a, this.f8563b, this.f8564c, this.f8565d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super Uri> eVar) {
        return ((t0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5  */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws IOException {
        OutputStream outputStreamOpenOutputStream;
        Application application = this.f8562a;
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        try {
            ContentResolver contentResolver = application.getContentResolver();
            int i10 = Build.VERSION.SDK_INT;
            File file = this.f8564c;
            String str = this.f8565d;
            String str2 = this.f8563b;
            if (i10 < 29) {
                File file2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "HTMLtoAPK");
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                File file3 = new File(file2, str2);
                ah.l.e(file, file3);
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_display_name", str2);
                    contentValues.put("mime_type", str);
                    contentValues.put("_data", file3.getAbsolutePath());
                    contentResolver.insert(MediaStore.Files.getContentUri("external"), contentValues);
                } catch (Exception e10) {
                    BuildLogger buildLogger = BuildLogger.INSTANCE;
                    String message = e10.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    buildLogger.detail(R.string.build_log_mediastore_fallback, message);
                }
                try {
                    return FileProvider.getUriForFile(application, application.getPackageName() + ".fileprovider", file3);
                } catch (Exception unused) {
                    return Uri.fromFile(file3);
                }
            }
            Uri contentUri = MediaStore.Downloads.getContentUri("external_primary");
            kotlin.jvm.internal.r.d(contentUri, "getContentUri(...)");
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("_display_name", str2);
            contentValues2.put("mime_type", str);
            contentValues2.put("relative_path", Environment.DIRECTORY_DOWNLOADS + "/HTMLtoAPK");
            Uri uriInsert = contentResolver.insert(contentUri, contentValues2);
            if (uriInsert == null || (outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert)) == null) {
                return uriInsert;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    long jA = ah.b.a(fileInputStream, outputStreamOpenOutputStream, 8192);
                    fileInputStream.close();
                    i.a.b(jA);
                    outputStreamOpenOutputStream.close();
                    return uriInsert;
                } finally {
                }
            } finally {
            }
        } catch (Exception e11) {
            BuildLogger buildLogger2 = BuildLogger.INSTANCE;
            String message2 = e11.getMessage();
            buildLogger2.error(R.string.build_log_downloads_copy_failed, message2 != null ? message2 : "");
            return null;
        }
        BuildLogger buildLogger22 = BuildLogger.INSTANCE;
        String message22 = e11.getMessage();
        buildLogger22.error(R.string.build_log_downloads_copy_failed, message22 != null ? message22 : "");
        return null;
    }
}
