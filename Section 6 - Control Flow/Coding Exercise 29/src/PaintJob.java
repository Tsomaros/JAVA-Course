public class PaintJob {

    public static void main(String[] args) {
        getBucketCount(3.4, 2.1, 1.5, 2);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)||(extraBuckets<0)) {
            return -1;
        }

        double wallArea = (width * height);

        int bucketsNeeded = (int) ((wallArea / areaPerBucket) - extraBuckets);
        if (bucketsNeeded < (wallArea/areaPerBucket)){
            bucketsNeeded++;
        }
        return bucketsNeeded;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if ((width<0)||(height<0)||(areaPerBucket<0)){
            return -1;
        }
        int bucketsNeeded = getBucketCount(width,height,areaPerBucket,0);
        return bucketsNeeded;
    }

    public static int getBucketCount(double area,double areaPerBucket){
        if ((area <0)||(areaPerBucket<0)){
            return -1;
        }
        double sqRoot = Math.sqrt(area);
        int bucketsNeeded = getBucketCount(sqRoot,sqRoot,areaPerBucket);
        return bucketsNeeded;
    }
}
