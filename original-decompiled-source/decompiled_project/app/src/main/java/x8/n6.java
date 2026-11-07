package x8;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$copyExportToDownloads$2", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class n6 extends vg.i implements eh.p<ph.i0, tg.e<? super Uri>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j6 f32982a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f32983b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ File f32984c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(j6 j6Var, Context context, File file, tg.e<? super n6> eVar) {
        super(2, eVar);
        this.f32982a = j6Var;
        this.f32983b = context;
        this.f32984c = file;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new n6(this.f32982a, this.f32983b, this.f32984c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super Uri> eVar) {
        return ((n6) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws IOException {
        OutputStream outputStreamOpenOutputStream;
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        Context context = this.f32983b;
        File file = this.f32984c;
        String name = file.getName();
        kotlin.jvm.internal.r.d(name, "getName(...)");
        try {
            ContentResolver contentResolver = context.getContentResolver();
            if (Build.VERSION.SDK_INT < 29) {
                File file2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "HTMLtoAPK");
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                File file3 = new File(file2, name);
                ah.l.e(file, file3);
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_display_name", name);
                    contentValues.put("mime_type", "application/zip");
                    contentValues.put("_data", file3.getAbsolutePath());
                    contentResolver.insert(MediaStore.Files.getContentUri("external"), contentValues);
                } catch (Exception unused) {
                }
                try {
                    return FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file3);
                } catch (Exception unused2) {
                    return Uri.fromFile(file3);
                }
            }
            Uri contentUri = MediaStore.Downloads.getContentUri("external_primary");
            kotlin.jvm.internal.r.d(contentUri, "getContentUri(...)");
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("_display_name", name);
            contentValues2.put("mime_type", "application/zip");
            contentValues2.put("relative_path", Environment.DIRECTORY_DOWNLOADS + "/HTMLtoAPK");
            Uri uriInsert = contentResolver.insert(contentUri, contentValues2);
            if (uriInsert == null || (outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert)) == null) {
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
        } catch (Exception unused3) {
            return null;
        }
        return null;
    }
}
