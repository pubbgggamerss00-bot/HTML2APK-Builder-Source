package androidx.camera.core.impl.utils;

import android.location.Location;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.activity.m;
import androidx.camera.camera2.internal.i0;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import g1.a;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class Exif {
    public static final long INVALID_TIMESTAMP = -1;
    private static final String KILOMETERS_PER_HOUR = "K";
    private static final String KNOTS = "N";
    private static final String MILES_PER_HOUR = "M";
    private static final String TAG = "Exif";
    private final a mExifInterface;
    private boolean mRemoveTimestamp = false;
    private static final ThreadLocal<SimpleDateFormat> DATE_FORMAT = new ThreadLocal<SimpleDateFormat>() { // from class: androidx.camera.core.impl.utils.Exif.1
        @Override // java.lang.ThreadLocal
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    };
    private static final ThreadLocal<SimpleDateFormat> TIME_FORMAT = new ThreadLocal<SimpleDateFormat>() { // from class: androidx.camera.core.impl.utils.Exif.2
        @Override // java.lang.ThreadLocal
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    };
    private static final ThreadLocal<SimpleDateFormat> DATETIME_FORMAT = new ThreadLocal<SimpleDateFormat>() { // from class: androidx.camera.core.impl.utils.Exif.3
        @Override // java.lang.ThreadLocal
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    };
    private static final List<String> ALL_EXIF_TAGS = getAllExifTags();
    public static final String TAG_THUMBNAIL_ORIENTATION = "ThumbnailOrientation";
    private static final List<String> DO_NOT_COPY_EXIF_TAGS = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", TAG_THUMBNAIL_ORIENTATION);

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class Speed {

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public static final class Converter {
            final double mMph;

            public Converter(double d7) {
                this.mMph = d7;
            }

            public double toMetersPerSecond() {
                return this.mMph / 2.23694d;
            }
        }

        private Speed() {
        }

        public static Converter fromKilometersPerHour(double d7) {
            return new Converter(d7 * 0.621371d);
        }

        public static Converter fromKnots(double d7) {
            return new Converter(d7 * 1.15078d);
        }

        public static Converter fromMilesPerHour(double d7) {
            return new Converter(d7);
        }
    }

    private Exif(a aVar) {
        this.mExifInterface = aVar;
    }

    private void attachLastModifiedTimestamp() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strConvertToExifDateTime = convertToExifDateTime(jCurrentTimeMillis);
        this.mExifInterface.J("DateTime", strConvertToExifDateTime);
        try {
            this.mExifInterface.J("SubSecTime", Long.toString(jCurrentTimeMillis - convertFromExifDateTime(strConvertToExifDateTime).getTime()));
        } catch (ParseException unused) {
        }
    }

    private static Date convertFromExifDate(String str) {
        return DATE_FORMAT.get().parse(str);
    }

    private static Date convertFromExifDateTime(String str) {
        return DATETIME_FORMAT.get().parse(str);
    }

    private static Date convertFromExifTime(String str) {
        return TIME_FORMAT.get().parse(str);
    }

    private static String convertToExifDateTime(long j6) {
        return DATETIME_FORMAT.get().format(new Date(j6));
    }

    public static Exif createFromFile(File file) {
        return createFromFileString(file.toString());
    }

    public static Exif createFromFileString(String str) {
        return new Exif(new a(str));
    }

    public static Exif createFromImageProxy(ImageProxy imageProxy) {
        ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
        buffer.rewind();
        byte[] bArr = new byte[buffer.capacity()];
        buffer.get(bArr);
        return createFromInputStream(new ByteArrayInputStream(bArr));
    }

    public static Exif createFromInputStream(InputStream inputStream) {
        return new Exif(new a(inputStream));
    }

    public static List<String> getAllExifTags() {
        return Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", TAG_THUMBNAIL_ORIENTATION, "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");
    }

    private long parseTimestamp(String str, String str2) {
        if (str == null && str2 == null) {
            return -1L;
        }
        if (str2 == null) {
            try {
                return convertFromExifDate(str).getTime();
            } catch (ParseException unused) {
                return -1L;
            }
        }
        if (str != null) {
            return parseTimestamp(m.d(str, " ", str2));
        }
        try {
            return convertFromExifTime(str2).getTime();
        } catch (ParseException unused2) {
            return -1L;
        }
    }

    public void attachLocation(Location location) {
        a aVar = this.mExifInterface;
        aVar.getClass();
        if (location == null) {
            return;
        }
        aVar.J("GPSProcessingMethod", location.getProvider());
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        if (latitude < -90.0d || latitude > 90.0d || Double.isNaN(latitude)) {
            throw new IllegalArgumentException("Latitude value " + latitude + " is not valid.");
        }
        if (longitude < -180.0d || longitude > 180.0d || Double.isNaN(longitude)) {
            throw new IllegalArgumentException("Longitude value " + longitude + " is not valid.");
        }
        aVar.J("GPSLatitudeRef", latitude >= 0.0d ? KNOTS : "S");
        aVar.J("GPSLatitude", a.d(Math.abs(latitude)));
        aVar.J("GPSLongitudeRef", longitude >= 0.0d ? "E" : "W");
        aVar.J("GPSLongitude", a.d(Math.abs(longitude)));
        double altitude = location.getAltitude();
        String str = altitude >= 0.0d ? "0" : "1";
        aVar.J("GPSAltitude", new a.f(Math.abs(altitude)).toString());
        aVar.J("GPSAltitudeRef", str);
        aVar.J("GPSSpeedRef", KILOMETERS_PER_HOUR);
        aVar.J("GPSSpeed", new a.f((location.getSpeed() * TimeUnit.HOURS.toSeconds(1L)) / 1000.0f).toString());
        String[] strArrSplit = a.Q.format(new Date(location.getTime())).split("\\s+", -1);
        aVar.J("GPSDateStamp", strArrSplit[0]);
        aVar.J("GPSTimeStamp", strArrSplit[1]);
    }

    public void attachTimestamp() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strConvertToExifDateTime = convertToExifDateTime(jCurrentTimeMillis);
        this.mExifInterface.J("DateTimeOriginal", strConvertToExifDateTime);
        this.mExifInterface.J("DateTimeDigitized", strConvertToExifDateTime);
        try {
            String string = Long.toString(jCurrentTimeMillis - convertFromExifDateTime(strConvertToExifDateTime).getTime());
            this.mExifInterface.J("SubSecTimeOriginal", string);
            this.mExifInterface.J("SubSecTimeDigitized", string);
        } catch (ParseException unused) {
        }
        this.mRemoveTimestamp = false;
    }

    public void copyToCroppedImage(Exif exif) {
        ArrayList arrayList = new ArrayList(ALL_EXIF_TAGS);
        arrayList.removeAll(DO_NOT_COPY_EXIF_TAGS);
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            String str = (String) obj;
            String strJ = this.mExifInterface.j(str);
            String strJ2 = exif.mExifInterface.j(str);
            if (strJ != null && !strJ.equals(strJ2)) {
                exif.mExifInterface.J(str, strJ);
            }
        }
    }

    public void flipHorizontally() {
        int i6;
        switch (getOrientation()) {
            case 2:
                i6 = 1;
                break;
            case 3:
                i6 = 4;
                break;
            case 4:
                i6 = 3;
                break;
            case 5:
                i6 = 6;
                break;
            case 6:
                i6 = 5;
                break;
            case 7:
                i6 = 8;
                break;
            case 8:
                i6 = 7;
                break;
            default:
                i6 = 2;
                break;
        }
        this.mExifInterface.J("Orientation", String.valueOf(i6));
    }

    public void flipVertically() {
        int i6;
        switch (getOrientation()) {
            case 2:
                i6 = 3;
                break;
            case 3:
                i6 = 2;
                break;
            case 4:
                i6 = 1;
                break;
            case 5:
                i6 = 8;
                break;
            case 6:
                i6 = 7;
                break;
            case 7:
                i6 = 6;
                break;
            case 8:
                i6 = 5;
                break;
            default:
                i6 = 4;
                break;
        }
        this.mExifInterface.J("Orientation", String.valueOf(i6));
    }

    public String getDescription() {
        return this.mExifInterface.j("ImageDescription");
    }

    public a getExifInterface() {
        return this.mExifInterface;
    }

    public int getHeight() {
        return this.mExifInterface.k(0, "ImageLength");
    }

    public long getLastModifiedTimestamp() throws NumberFormatException {
        long timestamp = parseTimestamp(this.mExifInterface.j("DateTime"));
        if (timestamp == -1) {
            return -1L;
        }
        String strJ = this.mExifInterface.j("SubSecTime");
        if (strJ == null) {
            return timestamp;
        }
        try {
            long j6 = Long.parseLong(strJ);
            while (j6 > 1000) {
                j6 /= 10;
            }
            return timestamp + j6;
        } catch (NumberFormatException unused) {
            return timestamp;
        }
    }

    public Location getLocation() {
        double[] dArr;
        double dG;
        double d7;
        double dG2;
        double metersPerSecond;
        String strJ = this.mExifInterface.j("GPSProcessingMethod");
        a aVar = this.mExifInterface;
        String strJ2 = aVar.j("GPSLatitude");
        String strJ3 = aVar.j("GPSLatitudeRef");
        String strJ4 = aVar.j("GPSLongitude");
        String strJ5 = aVar.j("GPSLongitudeRef");
        if (strJ2 == null || strJ3 == null || strJ4 == null || strJ5 == null) {
            dArr = null;
        } else {
            try {
                dArr = new double[]{a.e(strJ2, strJ3), a.e(strJ4, strJ5)};
            } catch (IllegalArgumentException unused) {
                StringBuilder sbA = i0.a("latValue=", strJ2, ", latRef=", strJ3, ", lngValue=");
                sbA.append(strJ4);
                sbA.append(", lngRef=");
                sbA.append(strJ5);
                Log.w("ExifInterface", "Latitude/longitude values are not parsable. ".concat(sbA.toString()));
            }
        }
        a aVar2 = this.mExifInterface;
        a.d dVarL = aVar2.l("GPSAltitude");
        if (dVarL == null) {
            dG = -1.0d;
        } else {
            try {
                dG = dVarL.g(aVar2.f13226g);
            } catch (NumberFormatException unused2) {
            }
        }
        int iK = aVar2.k(-1, "GPSAltitudeRef");
        if (dG < 0.0d || iK < 0) {
            d7 = 0.0d;
        } else {
            d7 = dG * (iK != 1 ? 1 : -1);
        }
        a aVar3 = this.mExifInterface;
        a.d dVarL2 = aVar3.l("GPSSpeed");
        if (dVarL2 == null) {
            dG2 = 0.0d;
        } else {
            try {
                dG2 = dVarL2.g(aVar3.f13226g);
            } catch (NumberFormatException unused3) {
            }
        }
        String strJ6 = this.mExifInterface.j("GPSSpeedRef");
        if (strJ6 == null) {
            strJ6 = KILOMETERS_PER_HOUR;
        }
        long timestamp = parseTimestamp(this.mExifInterface.j("GPSDateStamp"), this.mExifInterface.j("GPSTimeStamp"));
        if (dArr == null) {
            return null;
        }
        if (strJ == null) {
            strJ = TAG;
        }
        Location location = new Location(strJ);
        location.setLatitude(dArr[0]);
        location.setLongitude(dArr[1]);
        if (d7 != 0.0d) {
            location.setAltitude(d7);
        }
        if (dG2 != 0.0d) {
            int iHashCode = strJ6.hashCode();
            if (iHashCode == 75) {
                strJ6.equals(KILOMETERS_PER_HOUR);
            } else if (iHashCode != 77) {
                if (iHashCode == 78 && strJ6.equals(KNOTS)) {
                    metersPerSecond = Speed.fromKnots(dG2).toMetersPerSecond();
                }
                location.setSpeed((float) metersPerSecond);
            } else {
                if (strJ6.equals(MILES_PER_HOUR)) {
                    metersPerSecond = Speed.fromMilesPerHour(dG2).toMetersPerSecond();
                }
                location.setSpeed((float) metersPerSecond);
            }
            metersPerSecond = Speed.fromKilometersPerHour(dG2).toMetersPerSecond();
            location.setSpeed((float) metersPerSecond);
        }
        if (timestamp != -1) {
            location.setTime(timestamp);
        }
        return location;
    }

    public String getMetadata() {
        return this.mExifInterface.j("Xmp");
    }

    public int getOrientation() {
        return this.mExifInterface.k(0, "Orientation");
    }

    public int getRotation() {
        switch (getOrientation()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public long getTimestamp() throws NumberFormatException {
        long timestamp = parseTimestamp(this.mExifInterface.j("DateTimeOriginal"));
        if (timestamp == -1) {
            return -1L;
        }
        String strJ = this.mExifInterface.j("SubSecTimeOriginal");
        if (strJ == null) {
            return timestamp;
        }
        try {
            long j6 = Long.parseLong(strJ);
            while (j6 > 1000) {
                j6 /= 10;
            }
            return timestamp + j6;
        } catch (NumberFormatException unused) {
            return timestamp;
        }
    }

    public int getWidth() {
        return this.mExifInterface.k(0, "ImageWidth");
    }

    public boolean isFlippedHorizontally() {
        return getOrientation() == 2;
    }

    public boolean isFlippedVertically() {
        int orientation = getOrientation();
        return orientation == 4 || orientation == 5 || orientation == 7;
    }

    public void removeLocation() {
        this.mExifInterface.J("GPSProcessingMethod", null);
        this.mExifInterface.J("GPSLatitude", null);
        this.mExifInterface.J("GPSLatitudeRef", null);
        this.mExifInterface.J("GPSLongitude", null);
        this.mExifInterface.J("GPSLongitudeRef", null);
        this.mExifInterface.J("GPSAltitude", null);
        this.mExifInterface.J("GPSAltitudeRef", null);
        this.mExifInterface.J("GPSSpeed", null);
        this.mExifInterface.J("GPSSpeedRef", null);
        this.mExifInterface.J("GPSDateStamp", null);
        this.mExifInterface.J("GPSTimeStamp", null);
    }

    public void removeTimestamp() {
        this.mExifInterface.J("DateTime", null);
        this.mExifInterface.J("DateTimeOriginal", null);
        this.mExifInterface.J("DateTimeDigitized", null);
        this.mExifInterface.J("SubSecTime", null);
        this.mExifInterface.J("SubSecTimeOriginal", null);
        this.mExifInterface.J("SubSecTimeDigitized", null);
        this.mRemoveTimestamp = true;
    }

    public void rotate(int i6) {
        if (i6 % 90 != 0) {
            String str = TAG;
            Locale locale = Locale.US;
            Logger.w(str, "Can only rotate in right angles (eg. 0, 90, 180, 270). " + i6 + " is unsupported.");
            this.mExifInterface.J("Orientation", String.valueOf(0));
            return;
        }
        int i7 = i6 % 360;
        int orientation = getOrientation();
        while (i7 < 0) {
            i7 += 90;
            switch (orientation) {
                case 2:
                    orientation = 5;
                    break;
                case 3:
                case 8:
                    orientation = 6;
                    break;
                case 4:
                    orientation = 7;
                    break;
                case 5:
                    orientation = 4;
                    break;
                case 6:
                    orientation = 1;
                    break;
                case 7:
                    orientation = 2;
                    break;
                default:
                    orientation = 8;
                    break;
            }
        }
        while (i7 > 0) {
            i7 -= 90;
            switch (orientation) {
                case 2:
                    orientation = 7;
                    break;
                case 3:
                    orientation = 8;
                    break;
                case 4:
                    orientation = 5;
                    break;
                case 5:
                    orientation = 2;
                    break;
                case 6:
                    orientation = 3;
                    break;
                case 7:
                    orientation = 4;
                    break;
                case 8:
                    orientation = 1;
                    break;
                default:
                    orientation = 6;
                    break;
            }
        }
        this.mExifInterface.J("Orientation", String.valueOf(orientation));
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x00ed A[Catch: all -> 0x00fd, Exception -> 0x0100, TryCatch #17 {Exception -> 0x0100, all -> 0x00fd, blocks: (B:73:0x00e9, B:75:0x00ed, B:82:0x010b, B:81:0x0103), top: B:126:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0103 A[Catch: all -> 0x00fd, Exception -> 0x0100, TryCatch #17 {Exception -> 0x0100, all -> 0x00fd, blocks: (B:73:0x00e9, B:75:0x00ed, B:82:0x010b, B:81:0x0103), top: B:126:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void save() throws Throwable {
        FileOutputStream fileOutputStream;
        InputStream fileInputStream;
        Closeable closeable;
        FileOutputStream fileOutputStream2;
        InputStream fileInputStream2;
        FileOutputStream fileOutputStream3;
        InputStream fileInputStream3;
        Object obj;
        BufferedInputStream bufferedInputStream;
        if (!this.mRemoveTimestamp) {
            attachLastModifiedTimestamp();
        }
        a aVar = this.mExifInterface;
        int i6 = aVar.f13223d;
        if (i6 != 4 && i6 != 13 && i6 != 14) {
            throw new IOException("ExifInterface only supports saving attributes on JPEG, PNG, or WebP formats.");
        }
        if (aVar.f13221b == null && aVar.f13220a == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        int i7 = aVar.f13231m;
        InputStream inputStream = null;
        aVar.f13230l = (i7 == 6 || i7 == 7) ? aVar.u() : null;
        try {
            File fileCreateTempFile = File.createTempFile("temp", "tmp");
            if (aVar.f13220a != null) {
                fileInputStream = new FileInputStream(aVar.f13220a);
            } else {
                Os.lseek(aVar.f13221b, 0L, OsConstants.SEEK_SET);
                fileInputStream = new FileInputStream(aVar.f13221b);
            }
            try {
                fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    a.h(fileInputStream, fileOutputStream);
                    a.c(fileInputStream);
                    a.c(fileOutputStream);
                    try {
                        try {
                            try {
                                fileInputStream3 = new FileInputStream(fileCreateTempFile);
                                try {
                                    if (aVar.f13220a != null) {
                                        fileOutputStream2 = new FileOutputStream(aVar.f13220a);
                                    } else {
                                        Os.lseek(aVar.f13221b, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream2 = new FileOutputStream(aVar.f13221b);
                                    }
                                } catch (Exception e6) {
                                    e = e6;
                                    fileOutputStream2 = null;
                                    obj = null;
                                }
                            } catch (Exception e7) {
                                e = e7;
                                fileOutputStream2 = null;
                            }
                            try {
                                bufferedInputStream = new BufferedInputStream(fileInputStream3);
                            } catch (Exception e8) {
                                e = e8;
                                obj = null;
                                inputStream = fileInputStream3;
                                try {
                                    try {
                                        fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                    } catch (Exception e9) {
                                        e = e9;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                }
                                try {
                                    if (aVar.f13220a != null) {
                                    }
                                    fileOutputStream2 = fileOutputStream3;
                                    a.h(fileInputStream2, fileOutputStream2);
                                    a.c(fileInputStream2);
                                    a.c(fileOutputStream2);
                                    throw new IOException("Failed to save new file", e);
                                } catch (Exception e10) {
                                    e = e10;
                                    inputStream = fileInputStream2;
                                    throw new IOException("Failed to save new file. Original file is stored in " + fileCreateTempFile.getAbsolutePath(), e);
                                } catch (Throwable th2) {
                                    th = th2;
                                    inputStream = fileInputStream2;
                                    a.c(inputStream);
                                    a.c(fileOutputStream2);
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            closeable = null;
                            a.c(inputStream);
                            a.c(closeable);
                            if (0 == 0) {
                                fileCreateTempFile.delete();
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream2);
                        try {
                            int i8 = aVar.f13223d;
                            if (i8 == 4) {
                                aVar.G(bufferedInputStream, bufferedOutputStream);
                            } else if (i8 == 13) {
                                aVar.H(bufferedInputStream, bufferedOutputStream);
                            } else if (i8 == 14) {
                                aVar.I(bufferedInputStream, bufferedOutputStream);
                            }
                            a.c(bufferedInputStream);
                            a.c(bufferedOutputStream);
                            fileCreateTempFile.delete();
                            aVar.f13230l = null;
                        } catch (Exception e11) {
                            e = e11;
                            inputStream = fileInputStream3;
                            fileInputStream2 = new FileInputStream(fileCreateTempFile);
                            if (aVar.f13220a != null) {
                                Os.lseek(aVar.f13221b, 0L, OsConstants.SEEK_SET);
                                fileOutputStream3 = new FileOutputStream(aVar.f13221b);
                            } else {
                                fileOutputStream3 = new FileOutputStream(aVar.f13220a);
                            }
                            fileOutputStream2 = fileOutputStream3;
                            a.h(fileInputStream2, fileOutputStream2);
                            a.c(fileInputStream2);
                            a.c(fileOutputStream2);
                            throw new IOException("Failed to save new file", e);
                        }
                    } catch (Exception e12) {
                        e = e12;
                    } catch (Throwable th5) {
                        th = th5;
                        closeable = null;
                        inputStream = bufferedInputStream;
                        a.c(inputStream);
                        a.c(closeable);
                        if (0 == 0) {
                        }
                        throw th;
                    }
                } catch (Exception e13) {
                    e = e13;
                    inputStream = fileInputStream;
                    try {
                        throw new IOException("Failed to copy original file to temp file", e);
                    } catch (Throwable th6) {
                        th = th6;
                        a.c(inputStream);
                        a.c(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    inputStream = fileInputStream;
                    a.c(inputStream);
                    a.c(fileOutputStream);
                    throw th;
                }
            } catch (Exception e14) {
                e = e14;
                fileOutputStream = null;
            } catch (Throwable th8) {
                th = th8;
                fileOutputStream = null;
            }
        } catch (Exception e15) {
            e = e15;
            fileOutputStream = null;
        } catch (Throwable th9) {
            th = th9;
            fileOutputStream = null;
        }
    }

    public void setDescription(String str) {
        this.mExifInterface.J("ImageDescription", str);
    }

    public void setOrientation(int i6) {
        this.mExifInterface.J("Orientation", String.valueOf(i6));
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", Integer.valueOf(getWidth()), Integer.valueOf(getHeight()), Integer.valueOf(getRotation()), Boolean.valueOf(isFlippedVertically()), Boolean.valueOf(isFlippedHorizontally()), getLocation(), Long.valueOf(getTimestamp()), getDescription());
    }

    private long parseTimestamp(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return convertFromExifDateTime(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }
}
