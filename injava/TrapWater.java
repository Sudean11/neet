package injava;

public class TrapWater {
    public int trap(int[] h) {
        int l = 0, r = h.length - 1, lmax = Integer.MIN_VALUE, rmax = Integer.MIN_VALUE, ans = 0;
        while (l < r) {
        lmax = Math.max(lmax, h[l]);
        rmax = Math.max(rmax, h[r]);
        ans += (lmax < rmax) ? lmax - h[l++] : rmax - h[r--];
        }
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        new TrapWater().trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
    }
}