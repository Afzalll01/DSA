/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int tar, MountainArray m) {
        int i=0;
        int j=m.length()-1;
        while(i<j){
            int mid=(i+j)/2;
            if(m.get(mid)<m.get(mid+1)) i=mid+1;
            else j=mid-1;
        }
        int peek=i;
        int p=0;
        int q=peek;
        while(p<=q){
            int mid=(p+q)/2;
            if(m.get(mid)==tar) return mid;
            else if(m.get(mid)>tar) q=mid-1;
            else p=mid+1;
        }
        int a=peek+1;
        int b=m.length()-1;
        while(a<=b){
            int mid=(a+b)/2;
            if(m.get(mid)==tar) return mid;
            else if(m.get(mid)>tar) a=mid+1;
            else b=mid-1; 
        }
        return -1;



    }
}