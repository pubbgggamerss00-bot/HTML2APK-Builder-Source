package ag;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import bg.e;
import hi.a0;
import hi.i;
import hi.x;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import zf.c;

/* loaded from: classes2.dex */
public final class b extends AsyncTask<Void, Void, a> {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference<Context> f556a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f557b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f558c;

    /* renamed from: d, reason: collision with root package name */
    public final int f559d;

    /* renamed from: e, reason: collision with root package name */
    public final int f560e;

    /* renamed from: f, reason: collision with root package name */
    public final yf.b f561f;

    public b(Context context, Uri uri, Uri uri2, int i10, int i11, yf.b bVar) {
        this.f556a = new WeakReference<>(context);
        this.f557b = uri;
        this.f558c = uri2;
        this.f559d = i10;
        this.f560e = i11;
        this.f561f = bVar;
    }

    public final void a(Uri uri, Uri uri2) throws Throwable {
        InputStream inputStreamOpenInputStream;
        Uri uri3 = this.f558c;
        Log.d("BitmapWorkerTask", "copyFile");
        if (uri2 == null) {
            throw new NullPointerException("Output Uri is null - cannot copy image");
        }
        Context context = this.f556a.get();
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                if (inputStreamOpenInputStream == null) {
                    throw new NullPointerException("InputStream for given input Uri is null");
                }
                OutputStream outputStreamOpenOutputStream = uri2.getScheme().equals("content") ? context.getContentResolver().openOutputStream(uri2) : new FileOutputStream(new File(uri2.getPath()));
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = inputStreamOpenInputStream.read(bArr);
                    if (i10 <= 0) {
                        bg.a.a(outputStreamOpenOutputStream);
                        bg.a.a(inputStreamOpenInputStream);
                        this.f557b = uri3;
                        return;
                    }
                    outputStreamOpenOutputStream.write(bArr, 0, i10);
                }
            } catch (Throwable th2) {
                th = th2;
                bg.a.a(null);
                bg.a.a(inputStreamOpenInputStream);
                this.f557b = uri3;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpenInputStream = null;
        }
    }

    public final void b(Uri uri, Uri uri2) throws Throwable {
        Closeable closeable;
        Response response;
        Uri uri3 = this.f558c;
        Log.d("BitmapWorkerTask", "downloadFile");
        if (uri2 == null) {
            throw new NullPointerException("Output Uri is null - cannot download image");
        }
        Context context = this.f556a.get();
        if (context == null) {
            throw new NullPointerException("Context is null");
        }
        xf.a aVar = xf.a.f33566b;
        if (aVar.f33567a == null) {
            aVar.f33567a = new OkHttpClient();
        }
        OkHttpClient okHttpClient = aVar.f33567a;
        i iVar = null;
        try {
            Request.Builder builder = new Request.Builder();
            builder.d(uri.toString());
            Response responseE = okHttpClient.a(builder.a()).e();
            try {
                ResponseBody responseBody = responseE.f19359g;
                i iVarS0 = responseBody.s0();
                try {
                    OutputStream outputStreamOpenOutputStream = uri3.getScheme().equals("content") ? context.getContentResolver().openOutputStream(uri2) : new FileOutputStream(new File(uri2.getPath()));
                    if (outputStreamOpenOutputStream == null) {
                        throw new NullPointerException("OutputStream for given output Uri is null");
                    }
                    a0 a0VarE = x.e(outputStreamOpenOutputStream);
                    iVarS0.m0(a0VarE);
                    bg.a.a(iVarS0);
                    bg.a.a(a0VarE);
                    bg.a.a(responseBody);
                    okHttpClient.f19279a.a();
                    this.f557b = uri3;
                } catch (Throwable th2) {
                    th = th2;
                    response = responseE;
                    closeable = null;
                    iVar = iVarS0;
                    bg.a.a(iVar);
                    bg.a.a(closeable);
                    if (response != null) {
                        bg.a.a(response.f19359g);
                    }
                    okHttpClient.f19279a.a();
                    this.f557b = uri3;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                response = responseE;
                closeable = null;
            }
        } catch (Throwable th4) {
            th = th4;
            closeable = null;
            response = null;
        }
    }

    public final void c() throws IOException, NullPointerException {
        Log.d("BitmapWorkerTask", "Uri scheme: " + this.f557b.getScheme());
        String scheme = this.f557b.getScheme();
        boolean zEquals = scheme.equals("http");
        Uri uri = this.f558c;
        if (zEquals || scheme.equals("https")) {
            try {
                b(this.f557b, uri);
                return;
            } catch (IOException | NullPointerException e10) {
                Log.e("BitmapWorkerTask", "Downloading failed", e10);
                throw e10;
            }
        }
        if (this.f557b.getScheme().equals("content")) {
            try {
                a(this.f557b, uri);
                return;
            } catch (IOException | NullPointerException e11) {
                Log.e("BitmapWorkerTask", "Copying failed", e11);
                throw e11;
            }
        }
        if (this.f557b.getScheme().equals("file")) {
            return;
        }
        String scheme2 = this.f557b.getScheme();
        Log.e("BitmapWorkerTask", "Invalid Uri scheme " + scheme2);
        throw new IllegalArgumentException(m3.a.a("Invalid Uri scheme", scheme2));
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b0  */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a doInBackground(Void[] voidArr) throws FileNotFoundException {
        a aVar;
        int i10;
        int iB;
        int i11;
        Matrix matrix;
        InputStream inputStreamOpenInputStream;
        int i12;
        Context context = this.f556a.get();
        if (context == null) {
            return new a(new NullPointerException("context is null"));
        }
        if (this.f557b == null) {
            return new a(new NullPointerException("Input Uri cannot be null"));
        }
        try {
            c();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            int i13 = options.outHeight;
            int i14 = options.outWidth;
            int i15 = this.f559d;
            int i16 = this.f560e;
            if (i13 > i16 || i14 > i15) {
                i10 = 1;
                while (true) {
                    if (i13 / i10 <= i16 && i14 / i10 <= i15) {
                        break;
                    }
                    i10 *= 2;
                }
            } else {
                i10 = 1;
            }
            options.inSampleSize = i10;
            int i17 = 0;
            options.inJustDecodeBounds = false;
            Rect rect = null;
            boolean z10 = false;
            Bitmap bitmapDecodeStream = null;
            while (true) {
                int i18 = -1;
                if (z10) {
                    if (bitmapDecodeStream == null) {
                        return new a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.f557b + "]"));
                    }
                    Uri uri = this.f557b;
                    try {
                        inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            iB = 0;
                        } else {
                            iB = new e(inputStreamOpenInputStream).b();
                            try {
                            } catch (IOException e10) {
                                e = e10;
                                Log.e("BitmapLoadUtils", "getExifOrientation: " + uri.toString(), e);
                                switch (iB) {
                                }
                                if (iB != 2) {
                                    i18 = 1;
                                }
                                c cVar = new c();
                                cVar.f35067a = iB;
                                cVar.f35068b = i11;
                                cVar.f35069c = i18;
                                matrix = new Matrix();
                                if (i11 != 0) {
                                }
                                if (i18 != 1) {
                                }
                                if (!matrix.isIdentity()) {
                                }
                            }
                        }
                    } catch (IOException e11) {
                        e = e11;
                        iB = 0;
                    }
                    switch (iB) {
                        case 3:
                        case 4:
                            i11 = 180;
                            break;
                        case 5:
                        case 6:
                            i11 = 90;
                            break;
                        case 7:
                        case 8:
                            i11 = 270;
                            break;
                        default:
                            i11 = 0;
                            break;
                    }
                    if (iB != 2 && iB != 7 && iB != 4 && iB != 5) {
                        i18 = 1;
                    }
                    c cVar2 = new c();
                    cVar2.f35067a = iB;
                    cVar2.f35068b = i11;
                    cVar2.f35069c = i18;
                    matrix = new Matrix();
                    if (i11 != 0) {
                        matrix.preRotate(i11);
                    }
                    if (i18 != 1) {
                        matrix.postScale(i18, 1.0f);
                    }
                    if (!matrix.isIdentity()) {
                        return new a(bitmapDecodeStream, cVar2);
                    }
                    try {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, true);
                        if (!bitmapDecodeStream.sameAs(bitmapCreateBitmap)) {
                            bitmapDecodeStream = bitmapCreateBitmap;
                        }
                    } catch (OutOfMemoryError e12) {
                        Log.e("BitmapLoadUtils", "transformBitmap: ", e12);
                    }
                    return new a(bitmapDecodeStream, cVar2);
                }
                try {
                    inputStreamOpenInputStream = context.getContentResolver().openInputStream(this.f557b);
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, rect, options);
                    } finally {
                        bg.a.a(inputStreamOpenInputStream);
                    }
                } catch (IOException e13) {
                    Log.e("BitmapWorkerTask", "doInBackground: ImageDecoder.createSource: ", e13);
                    aVar = new a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.f557b + "]", e13));
                    return aVar;
                } catch (OutOfMemoryError e14) {
                    Log.e("BitmapWorkerTask", "doInBackground: BitmapFactory.decodeFileDescriptor: ", e14);
                    options.inSampleSize *= 2;
                    i17 = 0;
                    rect = null;
                }
                if (options.outWidth == -1 || options.outHeight == -1) {
                    break;
                }
                if ((bitmapDecodeStream != null ? bitmapDecodeStream.getByteCount() : i17) > 104857600) {
                    options.inSampleSize *= 2;
                    i12 = 1;
                } else {
                    i12 = i17;
                }
                if (i12 == 0) {
                    z10 = true;
                }
            }
            a aVar2 = new a(new IllegalArgumentException("Bounds for bitmap could not be retrieved from the Uri: [" + this.f557b + "]"));
            bg.a.a(inputStreamOpenInputStream);
            return aVar2;
        } catch (IOException | NullPointerException e15) {
            aVar = new a(e15);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(a aVar) {
        a aVar2 = aVar;
        Exception exc = aVar2.f564c;
        yf.b bVar = this.f561f;
        if (exc == null) {
            bVar.onBitmapLoaded(aVar2.f562a, aVar2.f563b, this.f557b, this.f558c);
        } else {
            bVar.onFailure(exc);
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Bitmap f562a;

        /* renamed from: b, reason: collision with root package name */
        public final c f563b;

        /* renamed from: c, reason: collision with root package name */
        public final Exception f564c;

        public a(Bitmap bitmap, c cVar) {
            this.f562a = bitmap;
            this.f563b = cVar;
        }

        public a(Exception exc) {
            this.f564c = exc;
        }
    }
}
