package poo;

public class StatCalc {
		private int []v;
		
		StatCalc(int v[]) {
			this.v = v;
		}
		
		public int getCount() {
			return v.length;
		}
		
		public int getSum() {
			int sum=0;
			for(int i=0;i<v.length;i++)
				sum+=v[i];
			
			return sum;
		}
		
		public float getMean() {
			return (float)this.getSum()/(float)v.length;
		}
		
		public int getMin() {
			int min = v[0];
			for(int i=1;i<v.length;i++) {
				if(v[i] < min)
					min=v[i];
			}
			return min;
		}
		
		public int getMax() {
			int max = v[0];
			for(int i=1;i<v.length;i++) {
				if(v[i] > max)
					max=v[i];
			}
			return max;
		}
		
		public float getStandardDeviation() {
			long sum=0;
			float average = this.getMean();
			for(int i=0;i<v.length;i++) {
				sum +=(long) Math.pow((v[i] - average),2);
			}
			
			return (float)Math.sqrt(sum/v.length);
		}
		
		
}
