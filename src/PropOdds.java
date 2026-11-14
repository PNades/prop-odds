public class PropOdds {
	private static final String CORRECTION = 
		"Usage: java -cp src PropOdds <	<winRate> <avgWin> <avgLoss> <tradesPerDay> <profitTarget> <drawdown>\n"
		+ "Example: java -cp src PropOdds 0.45 300 200 3 3000 2000";

	public static void main(String[] args) {
		if (args.length != 6) {
			System.out.println(CORRECTION);
			return;
		}
	
		double winRate;
		double avgWin;
		double avgLoss;
		int tradesPerDay;
		double profitTarget;
		double drawdown;
	
		try {
			winRate = Double.parseDouble(args[0]);
			avgWin = Double.parseDouble(args[1]);
			avgLoss = Double.parseDouble(args[2]);
			tradesPerDay = Integer.parseInt(args[3]);
			profitTarget = Double.parseDouble(args[4]);
			drawdown = Double.parseDouble(args[5]);
		} catch (NumberFormatException e) {
			System.out.println("Error: every argument must be a number (tradesPerDay must be a whole number).");
			System.out.println(CORRECTION);
			return;
		}

		if (winRate <= 0 || winRate >= 1) {
            		System.out.println("Error: winRate must be between 0 and 1.");
            		return;
        	}
        	if (avgWin <= 0 || avgLoss <= 0 || tradesPerDay <= 0 || profitTarget <= 0 || drawdown <= 0) {
            		System.out.println("Error: avgWin, avgLoss, tradesPerDay, profitTarget and drawdown must be positive.");
            		return;
        	}
		System.out.println("Win rate:       " + winRate);
        	System.out.println("Average win:    $" + avgWin);
        	System.out.println("Average loss:   $" + avgLoss);
        	System.out.println("Trades per day: " + tradesPerDay);
        	System.out.println("Profit target:  $" + profitTarget);
        	System.out.println("Drawdown:       $" + drawdown);
	}
}